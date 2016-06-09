var app = angular.module("app", ['ui.router','ngMaterial']);

app.config(function ($stateProvider, $urlRouterProvider, $provide) {
	$stateProvider
	.state('app',
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
	.state('app.main',
		{
			url: '',
			views: {
				'content@': {
					template: '',
					controller: 'MainCtrl'
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
	.state('app.newEnvironment',
		{
			url: "newenvironment",
			views: {
				'content@' : {
					templateUrl : 'views/newEnvironment.html',
					controller : 'EnvironmentController'
				}
			}
		}
	)
	;
	
	$urlRouterProvider.otherwise("/login");
});

app.controller('NavCtrl', NavCtrl);

function NavCtrl($scope, $rootScope) {
	$rootScope.showNav = true;
	$rootScope.currentNavItem = 'board';
	console.log('hee');
}