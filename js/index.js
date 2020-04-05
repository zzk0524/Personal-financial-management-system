new Vue({
    el: '.main',
    data: function() {
        return {
            key:'',
            form: {
                username: '',
                password: ''
            },
            rules: {
                username: [{
                        required: true,
                        message: '请输入用户名',
                        trigger: 'blur'
                    },
                    {
                        min: 3,
                        max: 32,
                        message: '长度在3-32个字符',
                        trigger: 'blur'
                    }
                ],
                password: [{
                        required: true,
                        message: '请输入密码',
                        trigger: 'blur'
                    },
                    {
                        min: 6,
                        max: 32,
                        message: '长度在6-32个字符',
                        trigger: 'blur'
                    }
                ]
            }
        }
    },
    methods: {
        onSubmit: function() {
            var _this = this;
            _this.$refs['form'].validate(function(valid) {
                if(valid) {
                    $.ajax({
                        url: 'http://127.0.0.1/user/login',
                        type: 'post',
                        data: _this.form,
                        dataType: 'json',
                        success: function(data) {
                            if(data.success) {
                                if(data.code == 2) {
                                    _this.roleid();
                                    _this.$message(data.message);
                                    _this.key=data.data.roleid;
                                    console.log(_this.key);
                                } else {
                                    _this.$message(data.message);
                                }
                            } else {
                                _this.$message(data.message);
                            }
                        }
                    });
                }
            });

        },
        Reset(){
        	this.form.username= '',
            this.form.password= ''
        },
        wordforms(){ 
            window.location.href='reportform.html';
        },
        incomesort(){
            window.location.href='incomesort.html';
        },
        outsort(){
            window.location.href='outsort.html';
        },
        incomerun(){
            window.location.href='incomerun.html';
        },
        outrun(){
            window.location.href='outrun.html';
        },
        roleid(){
            var _this = this;
            $.ajax({
                url: 'http://127.0.0.1/user/updateroleid',
                type: 'post',
                async:true,
                contentType:'application/json',
                data: _this.form.username,
                dataType: 'json',
                success: function(data) {

                    _this.$message(data.message);
                } 
            });
 
        }
    }
});