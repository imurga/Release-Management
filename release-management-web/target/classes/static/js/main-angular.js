var app = angular.module("app", ['ui.router']);

app.config(function ($stateProvider, $urlRouterProvider, $provide) {
	$stateProvider.state('app',
		{
			url: "/login",
			views: {
				'content' : {
					templateUrl : 'views/login.html',
					controller : 'loginController'
				}
			}
		}
	);
	
	$urlRouterProvider.otherwise("/login");
});