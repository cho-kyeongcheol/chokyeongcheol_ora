<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="../include/header.jsp" %>

<!-- container -->
	<div id="container">
	
	<%@ include file="../include/container_header.jsp" %>

		<!-- bodytext_area -->
		<div class="bodytext_area box_inner">
			<!-- appForm -->
			<form action="/board/write" class="appForm" method="post" encType="multipart/form-data">
				<fieldset>
					<legend>상담문의 입력 양식</legend>
					<p class="info_pilsoo pilsoo_item">필수입력</p>
					<ul class="app_list">	
					<li class="clear">
						<label for="pwd2_lbl" class="tit_lbl pilsoo_item">게시판선택</label>
						<select name="bod_type" class="form-control" required>					                 
			                 <option value="notice" <c:out value="${(session_bod_type eq 'notice')?('selected'):''}" />>공지사항</option>
			                 <option value="gallery" <c:out value="${(session_bod_type eq 'gallery')?('selected'):''}" />>갤러리</option>
			             </select>
			             </li>					
						<li class="clear">
							<label for="title_lbl" class="tit_lbl pilsoo_item">제목</label>
							<div class="app_content"><input name="title" type="text" class="w100p" id="title_lbl" placeholder="제목을 입력하세요." required /></div>
						</li>
						<li class="clear">
							<label for="content_lbl" class="tit_lbl pilsoo_item">내용</label>
							<div class="app_content"><textarea name="content" id="content_lbl" class="w100p" placeholder="내용을 남겨주세요." required ></textarea></div>
						</li>
						<li class="clear">
							<label for="pwd2_lbl" class="tit_lbl">작성자명</label>
							<div class="app_content"><input name="writer" type="password" class="w100p" id="pwd2_lbl" placeholder="이름을 입력해주세요." required /></div>
						</li>
						
					             <li class="clear">
						<label for="pwd2_lbl" class="tit_lbl">첨부파일</label>
							<input type="file" name="file" id="file_lbl" value="파일선택" />
						</li>
											
					</ul>
					<p class="btn_line">
					<button type="submit" class="btn_baseColor">등록</button>
					
					<button onclick="location.href='/board/list';return false;" class="btn_baseColor">목록</button>
					</p>	
					
				</fieldset>
			</form>
			<!-- //appForm -->
			
		</div>
		<!-- //bodytext_area -->

	</div>
	<!-- //container -->
	
	

	
<%@ include file="../include/footer.jsp" %>
   