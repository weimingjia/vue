var vue=new vue({
    el:"#app",
    data:{
        userList:[],
        user:{}
    },
    methods:{
        findAll:function () {

            var _this=this;
            axios.get("./user/findAll").then(function (value) {
                vue.userList=value.data
            })

        },
        findOne:function (id) {
            var _this=this;
            axios.get("./user/findOne/"+id).then(function (value) {
                _this.user=value.data
            })
        },
        update:function () {
            axios.post("./user/update",this.user).then(function (value) {
                vue.findAll();
            }).catch(function (reason) {
                alert("修改失败："+reason)
            })
        }
    },
    create:function () {
        this.findAll();
    }

})