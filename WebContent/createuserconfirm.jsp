<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<style type="text/css">
		.header{
		width: 100%;
		height: 70px;
   		background-color: black;
   		line-height: 70px;
   		text-align: center;
   		font-size: 30px;
   		color: white;
	}


		p{
		text-align: center;
		}

		table.list {
			border-collapse: collapse;
			text-align: left;
			line-height: 1.5;
			border-left: 1px solid #ccc;
		}

		table.list thead th {
			padding: 10px;
			font-weight: bold;
			border-top: 1px solid #ccc;
			border-right: 1px solid #ccc;
			border-bottom: 2px solid #c00;
			background: #dcdcd1;
		}
		table.list tbody th {
			width: 150px;
			padding: 10px;
			font-weight: bold;
			vertical-align: top;
			border-right: 1px solid #ccc;
			border-bottom: 1px solid #ccc;
			background: #ececec;
		}
		table.list td {
			width: 350px;
			padding: 10px;
			vertical-align: top;
			border-right: 1px solid #ccc;
			border-bottom: 1px solid #ccc;
		}
	</style>
<title>確認画面</title>
</head>
<body>
<div class="header">
ユーザー登録ページ
</div>

<div class="confirmbox">
<p>以下の内容で登録します</p>
<table class="list">
	<thead>
	<tr>
		<th>登録項目</th>
		<th>登録内容</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<th>お名前</th>
		<td><s:property value="userName"/></td>
	</tr>
		<tr>
		<th>パスワード</th>
		<td><s:property value="password"/></td>
	</tr>
		<tr>
		<th>郵便番号</th>
		<td><s:property value="postalCode"/></td>
	</tr>
	<tr>
		<th>住所</th>
		<td><s:property value="address"/></td>
	</tr>
	<tr>
		<th>電話番号</th>
		<td><s:property value="tell"/></td>
	</tr>
	<tr>
		<th>メールアドレス</th>
		<td><s:property value="email"/></td>
	</tr>
	</tbody>
</table>
<p>よろしければ確認を押してください</p>
<s:form action="CreateUserComplateAction">
<input type="hidden" name="userName" value='<s:property value="userName"/>'/>
<input type="hidden" name="password" value='<s:property value="password"/>'/>
<input type="hidden" name="postalCode" value='<s:property value="postalCode"/>'/>
<input type="hidden" name="address" value='<s:property value="address"/>'/>
<input type="hidden" name="tell" value='<s:property value="tell"/>'/>
<input type="hidden" name="email" value='<s:property value="email"/>'/>
<s:submit value="確認"/>
</s:form>
</div>
</body>
</html>