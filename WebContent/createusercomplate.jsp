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
	</style>
<title>ユーザー登録完了画面</title>
</head>
<body>
<div class="header">
ユーザー登録ページ
</div>

<p>ユーザー登録を完了しました！</p><br>
<p><a href='<s:url action="BackLoginAction" />'>ログインして商品購入を続ける。</a></p>
</body>
</html>