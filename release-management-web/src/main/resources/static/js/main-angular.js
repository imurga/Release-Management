var app = angular.module("app", ['ui.router']);

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
			url: "/board",
			views: {
				'content@' : {
					templateUrl : 'views/board.html',
					controller : 'BoardController'
				}
			}
		}
	)
	;
	
	$urlRouterProvider.otherwise("/login");
});