<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
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

		h2{
		text-align: center;
		font-size: 20px;
		}

		p{
		text-align: center;
		font-size: 20px;
		color: red;
		}

		.roginbox{
		width:100%;
		margin-top: 20px;
		display: flex;
  		justify-content: center;
  		align-items: center;
  		height: 100%;
  		text-align: center;
	}

		.acountbox{
		width:100%;
		margin-top: 50px;
		display: flex;
  		justify-content: center;
  		align-items: center;
  		height: 100%;
  		text-align: center;
	}
	</style>
<title>ログイン画面</title>
</head>
<body>
<div class="header">
ログイン認証ページ
</div>
<h2>こちらに入力をお願いします</h2>

<s:if test="errorMessage!=null">
<p>*<s:property value="errorMassage"/>*</p>
</s:if>

<div class="roginbox">
<s:form action="LoginAction">
<s:textfield name="userName" label="ユーザー名"/>
<s:password name ="password" label="パスワード"/>
<input type="hidden" name="flg" value='<s:property value="flg"/>'>
<s:submit value="ログイン"/>
</s:form>
</div>

<div class="acountbox">
<%--
<s:form action="GoCreateUserAction">
<s:submit value="新しくアカウントをつくる"/>
</s:form> --%>
<span>新しくアカウントをつくるには<a href='<s:url action="GoCreateUserAction" />'>こちら</a></span>
</div>
</body>
</html>