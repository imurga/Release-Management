var app = angular.module("app", ['ui.router','ngMaterial']);

app.config(function ($stateProvider, $urlRouterProvider, $provide) {
	$stateProvider.state('app',
		{
			url: "/",
			views: {
				'content' : {
					templateUrl : 'views/login.html',
					controller : 'LoginController'
				}
			}
		}
	)
	.state('app.board',
		{
			url: "board",
			views: {
				'content@' : {
					templateUrl : 'views/board.html',
					controller : 'BoardController'
				}
			}
		}
	)
	.state('app.environment',
		{
			url: "environment",
			views: {
				'content@' : {
					templateUrl : 'views/environment.html',
					controller : 'EnvironmentController'
				}
			}
		}
	)
	;
	
	$urlRouterProvider.otherwise("/login");
});