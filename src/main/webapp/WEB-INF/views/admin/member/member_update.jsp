<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../include/header.jsp"%>

<div class="col-12">
	<!-- general form elements disabled -->
	<div class="card card-warning">

<div class="card-header">
							<h3 class="card-title">회원수정</h3>
						</div>

		<!-- /.card-header -->
		<div class="card-body">
			<form role="form" action="/admin/member/update" method="POST">
				<div class="row">
					<div class="col-sm-4">
						<!-- text input -->
						<div class="form-group">
							<label>user_id</label> <br>${memberVO.user_id} <input
								value="${memberVO.user_id}" type="hidden" name="user_id"
								class="form-control" placeholder="Enter ID">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<!-- textarea -->
						<div class="form-group">
							<label>user_pw</label> <input value=""
								type="text" name="user_pw" class="form-control"
								placeholder="${memberVO.user_pw}">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<!-- textarea -->
						<div class="form-group">
							<label>user_name</label> <input value="${memberVO.user_name}"
								type="text" name="user_name" class="form-control"
								placeholder="Enter name">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<!-- textarea -->
						<div class="form-group">
							<label>email</label> <input value="${memberVO.email}" type="text"
								name="email" class="form-control" placeholder="Enter Email">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-4">
						<!-- textarea -->
						<div class="form-group">
							<label>point</label> <input value="${memberVO.point}" type="text"
								name="point" class="form-control" placeholder="Enter point">
						</div>
					</div>
				</div>

			
				

				<div class="row">
					<div class="col-sm-2">
						<div class="form-group">
							<label>enabled</label> 
							<select name="enabled" class="form-control">
								<option value="0" 
								<c:out value="${(memberVO.enabled eq 'false') ? ('selected'):('')}"/> >
								false</option>
								<option value="1" <c:out value="${memberVO.enabled eq ('true') ? ('selected'):('')}"/> >
								true</option>
							</select> <label>level</label> <select name="levels" class="form-control">
								<option value="ROLE_USER" 
								<c:out value="${memberVO.levels eq 'ROLE_USER' ? 'selected':''}"/>>
								ROLE_USER</option>
								<option value="ROLE_ADMIN" 
								<c:out value="${memberVO.levels eq 'ROLE_ADMIN' ? 'selected':''}"/>>
								ROLE_ADMIN</option>
							</select> <br>
						</div>
					</div>
				</div>

				<div class="buttons">
					<button type="submit" class="btn btn-warning">Submit</button>
					<a href="/admin/member/list?page=${pageVO.page}" class="btn btn-primary">LIST ALL</a>
				</div>
				<input type="hidden" name="page" value="${pageVO.page}" >
			</form>
			<form name="uploadForm" id="uploadForm" enctype="multipart/form-data"
				method="post">
				<table class="table">
					<tbody id="fileTableTbody">
						<tr>
							<td id="dropZone">파일을 드래그 하세요</td>
						</tr>
					</tbody>
				</table>
			</form>



		</div>
		<!-- /.card-body -->
	</div>
	<!-- /.card -->
</div>





<%@ include file="../include/footer.jsp"%>
