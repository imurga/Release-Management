angular.module('app')
	.factory('LoginService', ['$http', function LoginServiceProvider($http) {
	return {
		getUserLoginInformation: function(args) {
			return $http({ method: 'GET', url: '/login-service/validate', params: args });
		}
	}
}]);
