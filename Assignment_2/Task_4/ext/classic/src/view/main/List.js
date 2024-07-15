 Ext.define('MYAPP.view.main.List', {
     extend: 'Ext.grid.Panel',
     xtype: 'mainlist',
     reference:'seriesGrid',

    requires: [
        'MYAPP.store.Personnel'
    ],

    // title: 'Schedule',

    plugins:{
      cellediting:{clicksToEdit:1}
    },
    store: {
        type: 'personnel'
    },
    tbar: {items: [
        {xtype:'button',text: 'Create',handler: 'onCreateClick'},
        {xtype:'button',text: 'Read',handler: 'onReadClick'},
        {xtype:'button',text: 'Update',handler: 'onUpdateClick'},
        {xtype:'button',text: 'Delete',handler: 'onDeleteClick'}]},

    columns: [
        { text: 'Series_id',  dataIndex: 'Series_id' ,flex: 1,editor:{xtype:'textfield',allowBlank:false}},
        { text: 'Series_name', dataIndex: 'Series_name', flex: 1 ,editor:{xtype:'textfield',allowBlank:false}},
        { text: 'TeamA', dataIndex: 'TeamA', flex: 1 ,editor:{xtype:'textfield',allowBlank:false}},
        { text: 'TeamB', dataIndex: 'TeamB', flex: 1 ,editor:{xtype:'textfield',allowBlank:false}},
        { text: 'Location', dataIndex: 'Location', flex: 1,editor:{xtype:'textfield',allowBlank:false} },
        { text: 'Date', dataIndex: 'Date', flex: 1,editor:{xtype:'textfield',allowBlank:false} },
        { text: 'Time', dataIndex: 'Time', flex: 1 ,editor:{xtype:'textfield',allowBlank:false}},
    ],

  listeners: {
        select: 'onItemSelected'
    }
});
