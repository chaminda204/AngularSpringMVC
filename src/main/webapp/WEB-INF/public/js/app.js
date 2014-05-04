
var studentApp = angular.module('studentApp', ['ngRoute', 'studentController']);

studentApp.config(['$routeProvider',
    function($routeProvider) {	
        $routeProvider.
            when('/students', {
                templateUrl: 'WEB-INF/public/jsp/students.jsp',
                controller: 'StudentCtrl'
            }).
            when('/student/:studentId', {
                templateUrl: 'WEB-INF/public/jsp/editStudent.jsp',
                controller: 'StudentCtrlUpd'
            }).
            when('/newStudent', {
                templateUrl: 'WEB-INF/public/jsp/editStudent.jsp',
                controller: 'StudentCtrlNew'
            }).
            otherwise({
                redirectTo: '/students'
            });
    }]);