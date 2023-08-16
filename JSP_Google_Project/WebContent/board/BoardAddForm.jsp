<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판 글쓰기</title>
	
	<style type="text/css">
		#container{
			width: 620px;
			height:300px;
		}
		
		#pageTitle{
			text-align: center;
		}
		
		table, td{
			border: 1px solid black;
		}
		
		.items{
			font-weight: bold;
			text-align: center;
			width: 100px;
		}
		
		#itemsInput{
			width: 500px;
		}
		
		#contents{
			overflow-y: scroll;
			overflow-x: hidden;
			resize: none;
		}
		
		.buttonAline{
			float: right;
			margin-top: 20px;
			margin-right: 10px;
		}
	</style>
	
	<script type="text/javascript">
		function pageMoveListFnc() {
			location.href = "./list";
		}
	</script>
</head>

<body>
	<div id="container">
		<p id="pageTitle">게시판 등록</p>
		<form action='add' method='post'>
			<table>
				<tr>
					<td class="items">제목</td>
					<td id="itemsInput">
						<input type="text" name="title">
					</td>
				</tr>
				<tr>
					<td class="items">작성자</td>
					<td>
						<input type="text" name="editor">
					</td>
				</tr>
				<tr>
					<td class="items">비밀번호</td>
					<td>
						<input type="text" name="postPwd">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<textarea id="contents" rows="20" cols="70" name="contents" required></textarea>
					</td>
				</tr>
			</table>
			<input type="button" class="buttonAline" value="취소" onclick="pageMoveListFnc();">
			<input type="submit" class="buttonAline" value="완료">
		</form>
	</div>
</body>
</html>