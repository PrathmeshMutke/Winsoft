Ext.define('MYAPP.store.Personnel', {
    extend: 'Ext.data.Store',

    alias: 'store.personnel',

    model: 'MYAPP.model.Personnel',

    data: { items: [
        { Series_id: '1', Series_name: "India Tour of Australia", TeamA: "India", TeamB:"Australia", Location:"Mumbai",Date:"14/4/2023", Time:"7:30 pm"},
        { Series_id: '2', Series_name: "India Tour of New Zealand",  TeamA: "India",  TeamB:"New Zealand", Location:"Pune",Date:"15/4/2023", Time:"1:30 pm"},
        { Series_id: '3', Series_name: "India Tour of Srilanka", TeamA: "Srilanka", TeamB:"India", Location:"Indore",Date:"16/4/2023", Time:"4:30 pm"},
        { Series_id: '4', Series_name: "IPL", TeamA: "Royal Challengers Banglore", TeamB:"Kolkata Knight Riders", Location:"Kolkata",Date:"17/4/2023", Time:"7:30 pm"},
    ]},

    proxy: {
        type: 'memory',
        reader: {
            type: 'json',
            rootProperty: 'items'
        }
    }
});
