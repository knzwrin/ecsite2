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
   		 background-color: black;
	}

	.menu ul{
    	margin: 0;
    	padding: 0;
    	list-style: none;
	}

	.menu li a{
	    display: block;
	    padding: 15px;
	    color: white;
	    font-size: 14px;
	    text-decoration: none;
		text-align:center;
	}

	.menu li a:hover{
	    background-color: lightgrey;
	}

	.menu ul:after{
	    content: "";
	    display: block;
	    clear: both;
	}

	.menu li{
	    float: left;
	    width: 150px;
	}

	h2{
	text-align: center;
	border-bottom: 5px solid black;
	}

	.wordSearch{
		width:100%;
		margin-top: 50px;
		display: flex;
  		justify-content: center;
  		align-items: center;
  		height: 100%;
  		text-align: center;
	}


	.categorybox{
		float:left;
    	width: 70%;
    	margin-top: 30px;
    	margin-left: 300px;
    	background-color: gray;
	}

	.category1{
    	float:left;
    	margin-top:20px;
    	width: 20%;
    	text-align: center;
	}

	img{
    	width: 200px;
    	heigit: 200px;
	}

	.footer{
	position: fixed;
	bottom: 0px;
    width: 100%;
    height: 50px;
    background-color: black;
    color: white;
    line-height: 50px;
    text-align: center;
}
	</style>
<title>home</title>
</head>
<body>
        <div class="header">
            <nav class="menu">
                <ul>
                    <li><a href="#">ECSITE</a></li>
                    <li><a href='<s:url action="GoLoginAction" />'>ログイン</a></li>
                    <li><a href="#">マイページ</a></li>
                </ul>
            </nav>
        </div>
        <h2>ワード検索</h2>
	<div class="wordSearch">
		<s:form action="WordSearchAction">
		<s:textfield name="searchWord" label="検索欄"/>
		<s:submit value="検索"/>
		</s:form>
	</div>
<!-- <input type="hidden" name="categoryId" value="1"> -->
<!-- 	<div class="categorybox">
		<div class="category1"><img src="img/sneakers.jpg"><br>服</div>
        <div class="category1"><img src="img/table.jpg"><br>家具</div>
        <div class="category1"><img src="img/apple.jpg"><br>食品</div>
        <div class="category1"><img src="img/note.jpg"><br>文房具</div>
        <div class="category1"><img src="img/refrigerator.jpg"><br>家電製品</div>
	</div> -->
	<h2>カテゴリー検索</h2>
	<div class="categorybox">
	<s:form action="CategorySearchAction">
		<div class="category1"><input type="hidden" name="categoryId" value="1"><s:submit value="文房具"/></div>
	</s:form>
	<s:form action="CategorySearchAction">
        <div class="category1"><input type="hidden" name="categoryId" value="2"><s:submit value="家具"/></div>
     </s:form>
     <s:form action="CategorySearchAction">
        <div class="category1"><input type="hidden" name="categoryId" value="3"><s:submit value="食品"/></div>
     </s:form>
     <s:form action="CategorySearchAction">
        <div class="category1"><input type="hidden" name="categoryId" value="4"><s:submit value="服"/></div>
    </s:form>
    <s:form action="CategorySearchAction">
        <div class="category1"><input type="hidden" name="categoryId" value="5"><s:submit value="家電製品"/></div>
    </s:form>
	</div>

        <div class="footer">footer</div>
</body>
</html>