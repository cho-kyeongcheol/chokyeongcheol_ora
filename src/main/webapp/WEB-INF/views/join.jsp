<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>onkeyup 이벤트 사용 예제-로그인/로그 아웃</title>
</head>
<body>

    <p>로그인/로그아웃 </p>
    <table id=areaLogin>
        <tr><td>아이디</td><td><input type=text id=loginId value=""></td></tr>
        <tr><td>비밀번호</td><td><input type=password id=passwd value="" onkeyup=onKeyupPasswd(event)></td></tr>
        <tr><td colspan=2><input type=button value="로그인" onclick=fnLogin()></td></tr>
    </table>
    
    <table id=areaLogout style="display:none;">
        <tr>
            <td><div id=loginInfo></div></td>
        </tr>
        <tr><td><input type=button value="로그 아웃" onclick=fnLogout()></td></tr>
    </table>
    
    <script type="text/javascript">
    
        function fnLogin(){
            var objLogin = document.getElementById("loginId");
            var objPasswd = document.getElementById("passwd");
            
            if(objLogin.value == ""){
                alert("아이디를 입력하세요..!!");
                objLogin.focus();
                return ;
            }
            else if(objPasswd.value == ""){
                alert("비밀번호를 입력하세요..!!");
                objPasswd.focus();
                return ;
            }
            
            
            document.getElementById("areaLogin").style.display = "none";
            
            var objLoginInfo = document.getElementById("loginInfo");
            objLoginInfo.innerHTML = objLogin.value + "님 로그인 되었습니다..!!";
            
            document.getElementById("areaLogout").style.display = "";
        }   
        
        
        
        function fnLogout(){
            document.getElementById("loginId").value = "";
            document.getElementById("passwd").value = "";
            
            document.getElementById("areaLogin").style.display = "";
            document.getElementById("areaLogout").style.display = "none";
        }    // end function fnLogout()
        
        
        
        function onKeyupPasswd(ev){
            var evKeyup = null;

            if(ev)                                          
                evKeyup = ev;    
            else                                          
                evKeyup = window.event;
                
            if(evKeyup.keyCode == 13){                        
                document.getElementById("passwd").blur();
                fnLogin();    
            }   
        
        }    
    </script>
</body>
</html>
