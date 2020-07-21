<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../include/header.jsp"%>
<script>

	</script>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1 class="m-0 text-dark">DashBoard Management</h1>
				</div>
				<!-- /.col -->
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">Starter Page</li>
					</ol>
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container-fluid -->
		<div class="col-12">
			<div class="card">
				<div class="card-header">
					<h3 class="card-title">게시판 검색</h3>
				</div>
			</div>
		</div>
		<div class="col-1" style="display: inline-block">
			<select class="form-control">
				<option>--</option>
			</select>
		</div>
		<div class="search" style="display: inline">
			<input type="text" name="search_keyword" placeholder="">
			<div class="button" style="display: inline">
				<button name="btn_search">검색</button>
			</div>
			<div class="button" style="display: inline">
				<button>새글쓰기</button>
			</div>
		</div>

	</div>


	<div class="col-12">
		<!-- general form elements disabled -->
		<div class="card card-warning">



			<!-- /.card-header -->
			<div class="card-body">
				<form role="form" action="/admin/board/delete" method="post">
					<div class="row">
						<div class="col-sm-6">
							<!-- text input -->
							<div class="form-group">
								<label>Title</label> <br> ${boardVO.title}
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-6">
							<!-- textarea -->
							<div class="form-group">
								<label>Content</label>
								 <br>
								 <textarea name ="content" class="form-control" rows="3"
									placeholder="Enter.....">
									${boardVO.content}
									</textarea>
								 </div>
							</div>

						</div>
					</div>
					<div class="row">
						<div class="col-sm-6">
							<div class="form-group">
								<label>Writer</label> <br>${boardVO.writer}
							
							</div>
						</div>
					</div>
					
					
					<div class="row">
						<div class="col-sm-6">
							<div class="form-group">
								<label>FileDownload</label> <br>${boardVO.files[0]}
							<a href="/download?filename=${boardVO.files[0]}">${boardVO.files[0]}</a>
							</div>
						</div>
					</div>
					
					
					<div class="row">
						<div class="col-sm-6">

					<a href="/admin/board/update?bno=${boardVO.bno}" class="btn btn-warning">UPDATE</a>
					<button type="submit" class="btn btn-danger">DELETE</button>
					<a href="/admin/board/list" class="btn btn-primary">LIST ALL </a>
				</div>
				</div>
				<input type="hidden" name="bno" value="${boardVO.bno}">
				</form>
				
				

			</div>
			<!-- /.card-body -->

		</div>
		<!-- /.card -->
	</div>


	<form class="form-inline ml-3">
		<div class="input-group input-group-sm">
			<font size="5px"> ADD NEW REPLY</font>
		</div>
	</form>
	<br>

	<hr>



	<div class="card-body">
		<form role="form">
			<div class="row">
				<div class="col-sm-6">
					<!-- text input -->
					<div class="form-group">
						<label><font style="vertical-align: inherit"><font
								style="vertical-align: inherit">Writer</font></font></label> <input type="text"
							class="form-control" placeholder="USER ID">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<!-- textarea -->
					<div class="form-group">
						<label><font style="vertical-align: inherit"><font
								style="vertical-align: inherit">Reply Text</font></font></label> <input
							type="text" class="form-control" placeholder="REPLY TEXT">
					</div>
				</div>
			</div>
			<button type="button" class="btn btn-primary">ADD REPLY</button>
		</form>
	</div>


	<div class="card-body">
		<form role="form">
			<button type="button" class="btn btn-success">Replies List[1]</button>
			<div class="row">
				<div class="col-sm-6">
					<!-- textarea -->
					<div class="form-group">
						<label><font style="vertical-align: inherit"><font
								style="vertical-align: inherit"></font></font></label> <input type=text
							class="form-control" style="height: 100px"
							placeholder="26 - test  댓글 테스트 입니다.">
					</div>
				</div>
			</div>
		</form>
	</div>




	<!-- Control Sidebar -->
	<aside class="control-sidebar control-sidebar-dark">
		<!-- Control sidebar content goes here -->
		<div class="p-3">
			<h5>Title</h5>
			<p>Sidebar content</p>
			<button type="button" class="btn btn-primary btn-lg btn-block">로그아웃</button>
		</div>
	</aside>
	<!-- /.control-sidebar -->



	<%@ include file="../include/footer.jsp"%>