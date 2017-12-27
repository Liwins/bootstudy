/**
 * 控制器定义
 *注入$rootScope,$scpoe,$http
 */
actionApp.controller('View1Controller', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {
    // 使用$scpoe.$on监听$viewContentLoaded时间，可以在页面内容紧挨在完成后进行一些操作
    $scope.$on('$viewContentLoaded', function () {
        console.log("页面加载完成")
    });
    /**
     * 在scope内定义一个方法search,在页面上通过ng-click调用
     * 通过$scope.personName获取页面定义的ng-model='personName'的值
     * 使用$http.get向服务端地址search发送get请求
     * 使用params增加请求参数。
     * 用success方法作为请求成功后的回调
     * 将服务端返回的数据data通过$scope.person赋给模型person,这样页面视图上可以通过{{person.name}}来调用，且模型person值改变后视图自动更新
     */
    $scope.search = function () {
        personName = $scope.personName;
        $http.get('search', {
            params: {personName: personName}
        }).success(function (data) {
            $scope.person = data;
            alert(data);
        });
    }
}]);
actionApp.controller('View2Controller', ['$rootScope', '$scope', function ($rootScope, $scope) {
    $scope.$on('$viewContentLoaded', function () {
        console.log('页面加载完成')
    });
}]);