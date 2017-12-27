// 定义自定义的指令
/**
 * 定义一个指令名为datePicker
 * 限制为属性指令和样式指令
 * 使用link方法来定义指令，在link方法内可使用当前scope,当前元素以及元素属性。
 * 初始化jqueryui的datePicker（jquery的写法是$('#id').datePicker()）
 * 注：一些主流的脚本框架已经被很多人封装过了，获取地址
 * http://ngmodules.org/
 */
actionApp.directive('datePicker',function () {
    return{
        restrict: 'AC',
        link:function (scope, elem, attrs) {
            elem.datepicker();
        }
    };
});