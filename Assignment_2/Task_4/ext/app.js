/*
 * This file launches the application by asking Ext JS to create
 * and launch() the Application class.
 */
Ext.application({
    extend: 'MYAPP.Application',

    name: 'MYAPP',

    requires: [
        // This will automatically load all classes in the MYAPP namespace
        // so that application classes do not need to require each other.
        'MYAPP.*'
    ],

    // The name of the initial view to create.
    mainView: 'MYAPP.view.main.Main'
});
