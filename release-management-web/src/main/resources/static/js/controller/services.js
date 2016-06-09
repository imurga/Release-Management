angular.module('app')
	.factory('Service', ['$http', function ServiceProvider($http) {
	return {
		getUserLoginInformation: function(args) {
			return $http({ method: 'GET', url: '/login-service/validate', params: args });
		},
		getEnvironmentList: function(args) {
			return $http({ method: 'GET', url: '/environment-service/getAllEnvironment' });
		},
		saveRelease: function(args) {
			return $http({ method: 'POST', url: '/release-service/save', data: args });
		},
		getReleaseList: function(args) {
			return $http({ method: 'GET', url: '/release-service/getAllRelease' });
		}
	}
}]);
