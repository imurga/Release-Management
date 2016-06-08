angular.module('app')
	.factory('Service', ['$http', function ServiceProvider($http) {
	return {
		getUserLoginInformation: function(args) {
			return $http({ method: 'GET', url: '/login-service/validate', params: args });
		},
		getEnvironmentList: function(args) {
			return $http({ method: 'GET', url: '/environment-service/getAllEnvironment' });
		}
	}
}]);
