var demo = new Vue({
    el: '#adminLogin',
    data: {
        loginUrl: 'http://localhost:8080/PICC/adminLogin',
        logoutUrl: 'http://localhost:10648/api/Account/Logout',
        loginModel: {
            name: '',
            password: '',
            grant_type: 'password'
        },
        msg: '',
        userName: ''
    },

    ready: function() {
        this.userName = sessionStorage.getItem('userName')
    },
    methods: {
        login: function() {
            var vm = this
            vm.msg = ''
            vm.result = ''
            alert(vm.loginModel.name)
            $.ajax({
                url: vm.loginUrl,
                type: 'POST',
                dataType: 'json',
                data: vm.loginModel,
                success: function(data) {
                    vm.msg = '登录成功！'
                    // vm.userName = data.userName
                    sessionStorage.setItem('accessToken', data.access_token)
                    // sessionStorage.setItem('userName', vm.userName)
                },
                error: vm.requestError
            })
        },
        logout: function() {
            var vm = this
            vm.msg = ''

            $.ajax({
                url: vm.logoutUrl,
                type: 'POST',
                dataType: 'json',
                success: function(data) {

                    vm.msg = '注销成功！'
                    vm.userName = ''
                    vm.loginModel.userName = ''
                    vm.loginModel.password = ''

                    sessionStorage.removeItem('userName')
                    sessionStorage.removeItem('accessToken')
                },
                error: vm.requestError
            })
        },
        requestError: function(xhr, errorType, error) {
            this.msg = xhr.responseText
        }
    }
})