<%@ taglib prefix="master" tagdir="/WEB-INF/tags/masters"%>

<master:master>
	<jsp:body>
		<div ng-controller="indexController">
			<div class="thumbnail login-box">
				<div class="login-box-title">
					<span>Login</span>
				</div>
			
				<div class="form-group">
					<input type="text" class="form-control" placeholder="User" ng-model="login.usuario" />
				</div>
				
				<div class="form-group">
					<input type="password" class="form-control" placeholder="Password" ng-model="login.senha" />
				</div>
			
				<div class="form-group">
					<input type="button" value="Entrar" class="btn btn-primary btn-block" ng-click="entrar(login)" />
				</div>
			</div>
		</div>
	</jsp:body>
</master:master>