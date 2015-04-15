<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url var="messageBoxCss" value="/resources/css/messageBox.css" />
<c:url var="messageBoxJs" value="/resources/scripts/messageBox.js" />		

<link rel="stylesheet" href="${messageBoxCss}" />

<script src="${messageBoxJs}"></script>

<div id="messageBox" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<div id="messageBoxPanel" class="panel panel-default">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
        			<h4 id="messageBoxTitle" class="modal-title"></h4>
				</div>
				
				<div class="panel-body">
					<span id="messageBoxMessage"></span>
				</div>
				
				<div class="panel-footer">
					<input type="button" class="btn btn-primary" value="{{modal.primaryButton}}" data-dismiss="modal" />
					<input type="button" class="btn btn-default" value="{{modal.secondButton}}" data-dismiss="modal" />
				</div>
			</div>
		</div>
	</div>
</div>