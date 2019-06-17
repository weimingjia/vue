var vue = new Vue({
    el:"#app",
    data:{
        userList:[],
        user:{}
    },
    methods:{
        // 查询所有
        findAll:function () {
            var _this = this;
            axios.get("./user/findAll").then(function (response) {
                // 将查询的结果
                // vue.userList = response.data;
                // this.userList = response.data; // 如果this在axios中使用，此时不再是vue对象了，而是window对象
                // alert("ok");
                //window.alert("ok123");
                //this.alert("ok456");
                _this.userList = response.data;
            }).catch(function () {
                
            })
        },
        // 主键查询
        findById:function (id) {
            var _this = this;
            // axios.get("./user/findById?id="+id).then(function (response) {
            //     _this.user = response.data;
            // }).catch(function () {
            //
            // })

            // axios.get("./user/findById",{params:{id:id}}).then(function (response) {
            //     _this.user = response.data;
            // }).catch(function () {
            //
            // })

            // resful
            axios.get("./user/findOne/"+id).then(function (response) {
                _this.user = response.data;
            }).catch(function () {

            })
        },
        // 修改
        update:function () {
            axios.post("./user/update",this.user).then(function (response) {
                vue.findAll(); // 刷新页面
            }).catch(function (error) {
                alert(error);
            })
        }
    },
    created:function () {
        this.findAll();
    }
	
})