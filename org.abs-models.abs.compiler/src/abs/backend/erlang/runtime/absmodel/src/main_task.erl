%%This file is licensed under the terms of the Modified BSD License.
-module(main_task).
-behaviour(task).
-export([init/2,start/1]).
%%Executes main block



init(Cog,[Main,Starter])->
    link(Starter),
    {Main,Cog}.


start({Main,Cog})->
    Res=Main:main(Cog),
    cog:dec_ref_count(Cog),
    Res.

