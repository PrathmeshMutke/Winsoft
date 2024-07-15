/**
 * This class is the controller for the main view for the application. It is specified as
 * the "controller" of the Main view class.
 */
Ext.define('MYAPP.view.main.MainController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.main',

    onItemSelected: function (sender, record) {
        Ext.Msg.confirm('Confirm', 'Are you sure?', 'onConfirm', this);
    },


    onConfirm: function (choice) {
        if (choice === 'yes') {
            //
console.log("Inside confirm");

        }

    },

    onCreateClick: function(sender,record){

      var seriesGrid = this.lookupReference('seriesGrid');
      var seriesStore = seriesGrid.getStore();

      var newRecord = seriesStore.getModel().create({
        Series_id: '',
        Series_name: '',
        TeamA: '',
        TeamB:'',
        Location:'',
        Date:'',
        Time:'',
});
seriesStore.getProxy().data.items.push(newRecord.data);
seriesStore.load();

      console.log("Inside create");
      alert("Record created!!");
    },

    onReadClick:function(sender,record){
      console.log("Inside Read");
      alert("These are your records!!");
    },

    onUpdateClick:function(){
      console.log("Inside Update");

      var seriesGrid = this.lookupReference('seriesGrid');
      var seriesStore = seriesGrid.getStore();

      var modifiedRecords=seriesStore.getModifiedRecords();
      seriesStore.sync({
        success:function(){alert('Saved')},
        failure:function(){alert('NOO')}
      });
      alert("Record Updated!!");
    },
    onDeleteClick:function(sender,record){
      console.log("Inside Delete btn");

      var seriesGrid = this.lookupReference('seriesGrid');
      var seriesStore = seriesGrid.getStore();

      var selectedRows = seriesGrid.getSelectionModel().getSelection();
      seriesStore.remove(selectedRows);



      alert("Record Deleted!!");
    }

});
