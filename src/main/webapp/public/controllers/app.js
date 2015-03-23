
var studentApp = angular.module('studentApp', ['ngRoute', 'studentController']);

studentApp.config(['$routeProvider',
    function($routeProvider) {	
        $routeProvider.
            when('/students', {
                templateUrl: 'web-pages/students.jsp',
                controller: 'StudentCtrl'
            }).
            when('/student/:studentId', {
                templateUrl: 'web-pages/editStudent.jsp',
                controller: 'StudentCtrlUpd'
            }).
            when('/newStudent', {
                templateUrl: 'web-pages/editStudent.jsp',
                controller: 'StudentCtrlNew'
            }).
            otherwise({
                redirectTo: '/students'
            });
    }]);