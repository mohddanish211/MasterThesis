package org.xtext.abs.outline;


import static org.xtext.abs.Constants.*;
import static abs.common.Constants.STDLIB_NAME;
import static org.xtext.abs.outline.ABSContentOutlineConstants.*;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;

import abs.frontend.ast.ASTNode;
import abs.frontend.ast.Access;
import abs.frontend.ast.AddClassModifier;
import abs.frontend.ast.AddDataTypeModifier;
import abs.frontend.ast.AddFunctionModifier;
import abs.frontend.ast.AddInterfaceModifier;
import abs.frontend.ast.AddTypeSynModifier;
import abs.frontend.ast.ClassDecl;
import abs.frontend.ast.ConstructorArg;
import abs.frontend.ast.DataConstructor;
import abs.frontend.ast.DeltaDecl;
import abs.frontend.ast.Export;
import abs.frontend.ast.FromExport;
import abs.frontend.ast.FromImport;
import abs.frontend.ast.FunctionDecl;
import abs.frontend.ast.Import;
import abs.frontend.ast.InterfaceDecl;
import abs.frontend.ast.List;
import abs.frontend.ast.MainBlock;
import abs.frontend.ast.MethodImpl;
import abs.frontend.ast.MethodSig;
import abs.frontend.ast.ModifyClassModifier;
import abs.frontend.ast.ModifyDataTypeModifier;
import abs.frontend.ast.ModifyInterfaceModifier;
import abs.frontend.ast.ModifyTypeSynModifier;
import abs.frontend.ast.ModuleDecl;
import abs.frontend.ast.Name;
import abs.frontend.ast.NamedExport;
import abs.frontend.ast.NamedImport;
import abs.frontend.ast.ParamDecl;
import abs.frontend.ast.ParametricDataTypeDecl;
import abs.frontend.ast.ParametricDataTypeUse;
import abs.frontend.ast.ParametricFunctionDecl;
import abs.frontend.ast.ProductDecl;
import abs.frontend.ast.ProductLine;
import abs.frontend.ast.RemoveClassModifier;
import abs.frontend.ast.RemoveInterfaceModifier;
import abs.frontend.ast.StarExport;
import abs.frontend.ast.StarImport;
import abs.frontend.ast.TypeDecl;
import abs.frontend.ast.TypeParameterDecl;
import abs.frontend.ast.TypeUse;
import abs.frontend.ast.TypedVarOrFieldDecl;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.xtext.abs.InternalASTNode;
import org.xtext.abs.UtilityFunctions;
import org.xtext.abs.navigator.ModulePath;
import org.xtext.abs.ui.builderTest.SampleABSNature;


public class ABSContentOutlineUtils {

	private static final ArrayList<ASTNode<?>> EMPTY_ASTNODE_LIST = new ArrayList<ASTNode<?>>(0);
	private static final StyledString STYLED_EMPTY = new StyledString("", STYLER_BLACK);
	private static final ILabelProvider WORKBENCH_LABEL_PROVIDER = new WorkbenchLabelProvider();

	/**
	 * Converts ASTNodes that are relevant for the Content Outline:<br/>(ModuleDecl,
	 * DataConstructor, TypeDecl, InterfaceDecl, MainBlock, Import, Export,
	 * FunctionDecl, ProductLine, Product, ClassDecl, TypedVarOrFieldDecl,
	 * MethodImpl and MethodSig )<br/>to its String representation. Used in
	 * {@link ABSContentOutlineStyledLabelProvider}.
	 *
	 * @param element
	 *            The element which should be converted into it String
	 *            representation
	 * @return The String representation or <code>null</code> if there is no
	 *         text label for the given object
	 */
	public static StyledString getLabel(ASTNode<?> element) {

	    if (element instanceof ModuleDecl) {
	        return new StyledString(((ModuleDecl) element).getName(), STYLER_BLACK);
	    } else if (element instanceof DataConstructor) {
	        return formatDataConstructor((DataConstructor) element);
	    } else if (element instanceof InterfaceDecl) {
	        InterfaceDecl iDecl = (InterfaceDecl) element;
	        return new StyledString(iDecl.getName(), STYLER_BLACK);
	    } else if (element instanceof TypeDecl) {
	        StyledString sb = new StyledString();
	        addWithNormalStyler(sb, ((TypeDecl) element).getName());
	        if (element instanceof ParametricDataTypeDecl) {
	            addWithNormalStyler(sb, formatParametricTypes(((ParametricDataTypeDecl) element).getTypeParameterList()));
	        }
	        return sb;
	    } else if (element instanceof MainBlock) {
	        return MAIN_BLOCK_STYLED_STRING;
	    } else if (element instanceof List<?>) {
	        return handleImportsExportsBlock((List<?>) element);
	    } else if (element instanceof Import) {
	        return formatImportExport((Import) element);
	    } else if (element instanceof Export) {
	        return formatImportExport((Export) element);
	    } else if (element instanceof FunctionDecl) {
	        return formatFunctionDecl((FunctionDecl) element);
	    } else if (element instanceof ProductLine) {
	        // FIXME Unfold ProductLine Definition
	        return new StyledString(((ProductLine) element).getName(), STYLER_BLACK);
	    } else if (element instanceof ProductDecl) {
	        // FIXME Unfold Product Definition
	        return new StyledString(((ProductDecl) element).getName(), STYLER_BLACK);
	    } else if (element instanceof DeltaDecl) {
	        return new StyledString(((DeltaDecl) element).getName(), STYLER_BLACK);
	    } else if (element instanceof AddTypeSynModifier) {
	        return new StyledString("✳" + ((AddTypeSynModifier) element).getName(), STYLER_BLACK);
	    } else if (element instanceof ModifyTypeSynModifier) {
	        return new StyledString("✎" + ((ModifyTypeSynModifier) element).getName(), STYLER_BLACK);
	    } else if (element instanceof AddDataTypeModifier) {
	        return new StyledString("✳" + ((AddDataTypeModifier) element).getName(), STYLER_BLACK);
	    } else if (element instanceof ModifyDataTypeModifier) {
	        return new StyledString("✎" + ((ModifyDataTypeModifier) element).getName(), STYLER_BLACK);
	    } else if (element instanceof AddFunctionModifier) {
	        return new StyledString("✳" + ((AddFunctionModifier) element).getName(), STYLER_BLACK);
	    } else if (element instanceof AddClassModifier) {
	        return new StyledString("✳" + ((AddClassModifier) element).getName(), STYLER_BLACK);
	    } else if (element instanceof RemoveClassModifier) {
	        return new StyledString("✘" + ((RemoveClassModifier) element).getName(), STYLER_BLACK);
	    } else if (element instanceof ModifyClassModifier) {
	        return new StyledString("✎" + ((ModifyClassModifier) element).getName(), STYLER_BLACK);
	    } else if (element instanceof AddInterfaceModifier) {
	        return new StyledString("✳" + ((AddInterfaceModifier) element).getName(), STYLER_BLACK);
            } else if (element instanceof RemoveInterfaceModifier) {
                return new StyledString("✘" + ((RemoveInterfaceModifier) element).getName(), STYLER_BLACK);
	    } else if (element instanceof ModifyInterfaceModifier) {
	        return new StyledString("✎" + ((ModifyInterfaceModifier) element).getName(), STYLER_BLACK);
	    } else if (element instanceof ClassDecl) {
	        return formatClassDecl((ClassDecl) element);
	    } else if (element instanceof TypedVarOrFieldDecl) {
	        TypedVarOrFieldDecl fDecl = (TypedVarOrFieldDecl) element;
	        return formatTypedVarOrFieldDecl(fDecl);
	    } else if (element instanceof MethodImpl || element instanceof MethodSig) {
	        return formatMethod(element);
	    }

	    return new StyledString(WORKBENCH_LABEL_PROVIDER.getText(element), STYLER_BLACK);
	}
	
	
	/**
	 * Converts ASTNodes, that are wrapped in InternalASTNodes, relevant for the Content Outline
	 * <ul>
	 *  <li>ModuleDecl,
	 *  <li>DataConstructor, TypeDecl, InterfaceDecl, MainBlock, Import, Export,
	 *  <li>FunctionDecl, ProductLine, Product, ClassDecl, TypedVarOrFieldDecl,
	 *  <li>MethodImpl and MethodSig
	 * </ul>
	 * to its String representation. Used in {@link ABSContentOutlineStyledLabelProvider}.
	 *
	 * @param node internal ASTnode to be converted
	 * @return A String representation of the internal AST node or null if node is null
	 */
	public static StyledString getLabel(InternalASTNode<?> node){
		if (node != null){
			synchronized (node.getNature().modelLock) {
				return getLabel(node.getASTNode());
			}
		}

		return STYLED_EMPTY;
	}

	/**
	 * Returns a String representations of the given Object using {@link WorkbenchLabelProvider}.
	 * @param o Object to be converted
	 * @return A String representation of the Object
	 */
	public static StyledString getLabel(Object o){
		return new StyledString(WORKBENCH_LABEL_PROVIDER.getText(o), STYLER_BLACK);
	}

	/**
	 * Returns a String representation of the given {@link PackageAbsFile}.
	 * @param element
	 * @return A String representation of the PackageAbsFile
	 */
	public static StyledString getLabel(PackageAbsFile element){
		return new StyledString(element.getName(), STYLER_BLACK);
	}

	/**
	 * Returns a String representation of the given {@link PackageContainer}.
	 * @param element
	 * @return A String representation of the PackageContainer
	 */
	public static StyledString getLabel(PackageContainer element){
		return new StyledString("ABS Package Dependencies");
	}

	/**
	 * Returns a String representation of the given {@link PackageEntry}.
	 * @param element
	 * @return A String representation of the PackageEntry
	 */
	public static StyledString getLabel(PackageEntry element){
		String[] segments = element.getPath().split(File.separator);
		StyledString string = new StyledString(element.getName(), STYLER_BLACK);
		StringBuffer displayPath = new StringBuffer();
		displayPath.append(" - ");
		for (int i = 0; i < segments.length - 1; i++) {
			displayPath.append(segments[i]).append(File.separator);
		}
		return string.append(displayPath.toString(), STYLER_GREY);
	}

	/**
	 * Returns a String representation of the given ModulePath using {@link #getLastOfModulePath(ModulePath)}
	 * @see #getLastOfModulePath(ModulePath)
	 * @param element
	 * @return A String representation of the ModulePath
	 */
	public static StyledString getLabel(ModulePath element){
			return new StyledString((getLastOfModulePath(element)));
	}
	
	public static String getLastOfModulePath(ModulePath p) {
		if (p != null) {
			String modulePath = p.getModulePath();
			if (modulePath.indexOf('.') < 0) {
				return modulePath;
			} else {
				return modulePath.substring(modulePath.lastIndexOf('.') + 1, modulePath.length());
			}
		} else {
			return null;
		}
	}
	
	
	/**
	 * Returns the String representation of a <code>DataConstructor</code>
	 *
	 * @param dc
	 *            The target <code>DataConstructor</code>.
	 * @return The String representation or an empty String, if the
	 *         DataConstructor is null.
	 */
	private static StyledString formatDataConstructor(DataConstructor dc) {
		if (dc != null) {
			List<ConstructorArg> constList = dc.getConstructorArgList();

			StringBuilder sb = new StringBuilder();
			sb.append(dc.getName());

			// If the datatype constructor has type parameters...
			if (dc.getNumConstructorArg() > 0) {
				// ...append them by using formatAccess (below)
				sb.append(OUTLINE_PARAM_OPEN_PARENTHESIS);
				for (ConstructorArg tDecl : constList) {
					sb.append(formatAccess(tDecl.getTypeUse()));
					sb.append(OUTLINE_DELIMITER + " ");
				}
				// cleaning up the superfluous last delimiter and whitespace
				deleteLastCharacters(sb, 2);
				sb.append(OUTLINE_PARAM_CLOSE_PARENTHESIS);
			}

			return new StyledString(sb.toString(), STYLER_BLACK);
		} else {
			return STYLED_EMPTY;
		}
	}
	
	/**
	 * Returns the String Representation of an
	 * <code>List&lt;TypeParameterDecl&gt;</code>
	 *
	 * @param list
	 *            The target List of type
	 *            <code>List&lt;TypeParameterDecl&gt;</code>
	 * @return The string representation or an empty String, if the list is
	 *         empty.
	 */
	private static String formatParametricTypes (abs.frontend.ast.List<TypeParameterDecl> list){
		if (list.hasChildren()){
			StringBuilder sb = new StringBuilder();
			sb.append(OUTLINE_TYPE_PARAM_OPEN_PARENTHESIS);
			for (TypeParameterDecl tDecl : list){
				sb.append(tDecl.getName());
				sb.append(OUTLINE_DELIMITER);
			}
			deleteLastCharacter(sb);
			sb.append(OUTLINE_TYPE_PARAM_CLOSE_PARENTHESIS);
			return sb.toString();
		}else{
			return "";
		}
	}
	
	
	private static final void deleteLastCharacter(StringBuilder sb){
		sb.deleteCharAt(sb.length()-1);
	}

	private static final void deleteLastCharacters(StringBuilder sb, int len){
		for(int i=1; i<=len; i++){
			deleteLastCharacter(sb);
		}
	}

	private static final void addWithNormalStyler(StyledString sb, String s){
		sb.append(s, STYLER_BLACK);
	}
	
	/**
	 * Returns the String representation of a <code>TypeUse</code>. For
	 * subclasses, see {@link TypeUse}
	 *
	 * @param tu
	 *            The target <code>TypeUse</code>.
	 * @return The String representation or an empty String, if the TypeUse is
	 *         null.
	 */
	private static String formatAccess(TypeUse tu) {
		if (tu != null) {
			StringBuilder sb = new StringBuilder();

			// If the TypeUse comes from a Parametric datatype...
			if (tu instanceof ParametricDataTypeUse) {
				// ...cast it and...
				ParametricDataTypeUse ptu = (ParametricDataTypeUse) tu;
				// ...add existing type parameter values
				formatParametricDataTypeUse(sb, ptu);
			} else
				sb.append(tu.getName());

			return sb.toString();
		} else {
			return "";
		}
	}

	
	/**
	 * Evaluates a {@link ParametricDataTypeUse} and adds a String representation of its
	 * type parameters to a StringBuilder. If the ParamDecl is null, nothing
	 * will be added to the StringBuilder
	 *
	 *
	 * @param sb
	 *            The StringBuilder to which the String representation will be
	 *            added
	 * @param p
	 *            The target {@link ParametricDataTypeUse}
	 */
	private static void formatParametricDataTypeUse(StringBuilder sb,
			ParametricDataTypeUse ptu) {
		if (sb != null && ptu != null) {
				sb.append(ptu.toString()); // #314
		}
	}
	
	private static StyledString handleImportsExportsBlock(List<?> element) {
	    if (ABSContentOutlineUtils.isImportList(element)){
	    	return IMPORTS_BLOCK_STYLED_STRING;
	    } else if (ABSContentOutlineUtils.isExportList(element)){
	    	return EXPORTS_BLOCK_STYLED_STRING;
	    } else {
		return new StyledString(element.toString(), STYLER_BLACK);
	    }
	}
	
	
	/**
	 * Returns the String Representation of an <code>Import</code>
	 *
	 * @param imp
	 *            The target List of type <code>Import</code>
	 * @return The String representation or an empty String, if the Import is
	 *         none of {@link StarImport}, {@link NamedImport},
	 *         {@link FromImport}.
	 */
	private static StyledString formatImportExport(Import imp){
		if (imp instanceof StarImport){
			String moduleName = ((StarImport)imp).getModuleName();
			return new StyledString(moduleName,STYLER_BLACK);
		}else if (imp instanceof NamedImport) {
			String formatNames = formatNames(((NamedImport)imp).getNameList());
			return new StyledString(formatNames,STYLER_BLACK);
		}else if (imp instanceof FromImport){
			FromImport fromImp = (FromImport)imp;
			String names = formatNames(fromImp.getNameList()) + OUTLINE_FROM + fromImp.getModuleName();
			return new StyledString(names,STYLER_BLACK);
		}else {
			return STYLED_EMPTY;
		}
	}
	
	
	/**
	 * Returns the String Representation of an <code>List&lt;Name&gt;</code> in
	 * the form name1, name2, ...
	 *
	 * @param list
	 *            The target List of type <code>List&lt;Name&gt;</code>
	 * @return The string representation or an empty String, if the list is
	 *         empty
	 */
	private static String formatNames(abs.frontend.ast.List<Name> list) {
		StringBuilder sb = new StringBuilder();
		if (list.getNumChild() > 1) {
			for (Name name : list) {
				sb.append(name.getName());
				sb.append(OUTLINE_DELIMITER);
			}
			deleteLastCharacter(sb);
		}else if (list.getNumChild() == 1){
			sb.append(list.getChild(0).getName());
		}
		return sb.toString();
	}

	
	/**
	 * Returns the String Representation of an <code>Export</code>
	 *
	 * @param exp
	 *            The target List of type <code>Export</code>
	 * @return The String representation or an empty String, if the Export is
	 *         none of {@link StarExport}, {@link NamedExport},
	 *         {@link FromExport}.
	 */
	private static StyledString formatImportExport(Export exp) {
		if (exp instanceof StarExport) {
			if (((StarExport) exp).getModuleNameOpt().getNumChild() > 0) {
				String name = ((StarExport) exp).getModuleNameOpt().getChild(0).getName();
				return new StyledString(name,STYLER_BLACK);
			} else {
				return new StyledString(OUTLINE_STAR,STYLER_BLACK);
			}
		} else if (exp instanceof NamedExport) {
			String formatNames = formatNames(((NamedExport) exp).getNameList());
			return new StyledString(formatNames,STYLER_BLACK);
		} else {
			String string = formatNames(((FromExport) exp).getNameList())
		    		+ OUTLINE_FROM
		    		+ ((FromExport) exp).getModuleName();
			return new StyledString(string,STYLER_BLACK);
		}
	}
	
	static StyledString formatFunctionDecl(FunctionDecl element) {
	    StyledString sb = new StyledString();
	    FunctionDecl fDecl = element;

	    addWithNormalStyler(sb, fDecl.getName());

	    if (element instanceof ParametricFunctionDecl) {
	    	ParametricFunctionDecl pfDecl = ((ParametricFunctionDecl) fDecl);
	    	addWithNormalStyler(sb, formatParametricTypes(pfDecl.getTypeParameterList()));
	    }

	    sb.append(formatParams(fDecl.getParams()));
	    sb.append(TYPE_DELIMITER_STYLED_STRING);
	    sb.append(formatAccess(fDecl.getTypeUse()), STYLER_TYPES);

	    return sb;
	}
	
	/**
	 * Returns the String Representation of a <code>List&lt;ParamDecl&gt;</code>
	 * in the form (Type1 Name1, Type2 Name2, ...)
	 *
	 * @param list
	 *            The target List of type <code>List&lt;ParamDecl&gt;</code>
	 * @return Returns the String Representation of a
	 *         <code>List&lt;ParamDecl&gt;</code>
	 */
	private static StyledString formatParams(
			abs.frontend.ast.List<ParamDecl> list) {

		StringBuilder sb = new StringBuilder();
		sb.append(OUTLINE_PARAM_OPEN_PARENTHESIS);

		if (list.hasChildren()){
			for (ParamDecl p : list) {
				formatParam(sb, p);
				sb.append(OUTLINE_DELIMITER + " ");
			}
			deleteLastCharacters(sb, 2);
		}

		sb.append(OUTLINE_PARAM_CLOSE_PARENTHESIS);

		return new StyledString(sb.toString(),STYLER_BLACK);
	}
	
	private static StyledString formatClassDecl(ClassDecl element) {
	    if (element != null){
	    	StyledString sb = new StyledString();

	    	sb.append(element.getName());
	    	sb.append(formatParams(element.getParamList()));
	    	return sb;
	    }

	    return null;
	}
	
	/**
	 * Returns a StyledString representation of a TypedVarOrFieldDecl instance
	 * with the following scheme: <code>name : type</code>
	 *
	 * @param element
	 * @return colored name or null if element is null
	 */
	public static StyledString formatTypedVarOrFieldDecl(TypedVarOrFieldDecl element) {
		if (element != null){
			StyledString sb = new StyledString();
			addWithNormalStyler(sb, element.getName());
			sb.append(TYPE_DELIMITER_STYLED_STRING);
			sb.append(formatAccess(((TypeUse) element.getAccess())), STYLER_TYPES);
			return sb;
		}
		return null;
	}
	
	static StyledString formatMethod(Object element){
	    if (element instanceof MethodImpl){
		return formatMethodSig(((MethodImpl) element).getMethodSig());
	    } else if (element instanceof MethodSig){
		return formatMethodSig((MethodSig) element);
	    } else {
		return STYLED_EMPTY;
	    }
	}
	
	/**
	 * Utility method for formatting a ABS method signature
	 *
	 * @param element
	 * @return String representation of a ABS method signature or null if
	 *         element is null
	 */
	public static StyledString formatMethodSig(MethodSig element) {
		if (element != null) {
			StyledString sb = new StyledString();
			addWithNormalStyler(sb, element.getName());
			sb.append(formatParams(element.getParamList()));

			Access ac = element.getReturnType();
			if (ac instanceof TypeUse) {
				sb.append(TYPE_DELIMITER_STYLED_STRING);
				sb.append(formatAccess((TypeUse) ac), STYLER_TYPES);
			}

			return sb;
		}
		return null;
	}
	
	/**
	 * Determines whether T is an instance of {@link Export} in a
	 * {@link abs.frontend.ast.List}&lt;T&gt; by checking if the list is not
	 * empty and its first child is an Export instance
	 *
	 * The call of this operation should be synchronized to
	 * {@link AbsNature#modelLock}.
	 *
	 * @param list
	 *            The non-empty list to be checked
	 * @return True if T is an instance of {@link Export}, False if T is not an
	 *         instance of {@link Export} or <code>null</code>
	 */
	public static boolean isExportList(List<?> list) {
		return list != null && list.getNumChild() > 0 && list.getChild(0) instanceof Export;
	}
	
	/**
	 * Determines whether T is an instance of {@link Import} in a
	 * {@link abs.frontend.ast.List}&lt;T&gt; by checking if the list is not
	 * empty and its first child is an Import instance.
	 *
	 * The call of this operation should be synchronized to
	 * {@link AbsNature#modelLock}.
	 *
	 * @param list
	 *            The non-empty list to be checked
	 * @return True if T is an instance of {@link Import}, False if T is not an
	 *         instance of {@link Import} or <code>null</code>
	 */
	public static boolean isImportList(List<?> list) {
		return list != null && list.getNumChild() > 0 && list.getChild(0) instanceof Import;
		}

	
	/**
	 * Evaluates a ParamDecl and adds its String representation to a
	 * StringBuilder. If the ParamDecl is null, nothing will be added to the
	 * StringBuilder
	 *
	 *
	 * @param sb
	 *            The StringBuilderto which the String representation will be
	 *            added
	 * @param p
	 *            The target ParamDecl
	 */
	private static void formatParam(StringBuilder sb, ParamDecl p) {
		if (p != null) {
			TypeUse acc = ((TypeUse) p.getAccess());
			if (acc instanceof ParametricDataTypeUse) {
				ParametricDataTypeUse ptd = ((ParametricDataTypeUse) acc);
				formatParametricDataTypeUse(sb, ptd);
			} else {
				sb.append(acc.getName());
			}
		}
	}



	public static SampleABSNature getNatureForObject(Object element) {
		if (element != null) {
			SampleABSNature nature = null;
			if (element instanceof InternalASTNode) {
				nature = ((InternalASTNode<?>) element).getNature();
			} else if (element instanceof IFile) {
				nature = UtilityFunctions.getAbsNature((IFile)element);
			} else if (element instanceof IProject) {
				if (((IProject) element).isOpen()) {
					return UtilityFunctions.getAbsNature((IProject) element);
				}
			} else if (element instanceof ModulePath) {
				return ((ModulePath) element).getNature();
			}
			return nature;
		}
		return null;
	}
}
