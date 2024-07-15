/**
 * This class is the main view for the application. It is specified in app.js as the
 * "mainView" property. That setting automatically applies the "viewport"
 * plugin causing this view to become the body element (i.e., the viewport).
 *
 * TODO - Replace this content of this view to suite the needs of your application.
 */
Ext.define('MYAPP.view.main.Main', {
    extend: 'Ext.tab.Panel',
    xtype: 'app-main',

    requires: [
        'Ext.plugin.Viewport',
        'Ext.window.MessageBox',

        'MYAPP.view.main.MainController',
        'MYAPP.view.main.MainModel',
        'MYAPP.view.main.List'
    ],

    controller: 'main',
    viewModel: 'main',

    ui: 'navigation',

    items: [{
        title: 'Schedule by Board of Control for Cricket in India (BCCI)',
        items: [{
            xtype: 'mainlist'
        }]
      }]

});
