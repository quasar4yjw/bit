/*
 * 요청 파라미터의 값 꺼내기
 - 클라이언트가 보낸 데이터(요청 파라미터)


 */
var name;
var v1;
var v2;
var cpu;
var http = require('http'); // http 객체 가져오기

var url = require('url'); // url 객체 가져오기

http.createServer(function handler(req, res) {
	res.writeHead(200, {'Content-Type': 'text/html;charset=UTF-8'});
	var urlInfoMap = url.parse(req.url, true);
	
	
	v1 = parseInt(urlInfoMap.query.v1);
	v2 = parseInt(urlInfoMap.query.v2);
	cpu = urlInfoMap.query.op;
	
	if(cpu == 'plus'){
		res.write(v1+" + "+v2+" = "+(v1+v2));
	}else if(cpu == 'minus'){
		res.write(v1+" - "+v2+" = "+(v1-v2));
	}else if(cpu == 'multiple'){
		res.write(v1+" * "+v2+" = "+v1*v2);
	}else if(cpu == 'devide'){
		res.write(v1+" / "+v2+" = "+v1/v2);
	}else{
		res.write("연산자 없어요"); 
	    console.log("연산자 없어요");}
	//클라이언트가 보낸 name 파라미터 값을 변수에 저장
    
    res.write('<html><head><title>test문제</title></head>');
    res.write('<body>');
    res.write('<form><input name=v1><br>'+
    		'<select name="op">'+
    '<option>plus</option>'+
    '<option>minus</option>'+
    '<option>multiple</option>'+
    '<option>devide</option>'+
   
  '</select>'+
    		'<br><input name=v2><br>'+
    		'<button>연산</button></form>');
    res.write('<p>자바스크립트만 제대로'+
    		'배워도 서버측 애플리케이션을');
    res.write('개발할 수 있다. </p>');
    res.write('</body></html>');
    
    res.end();
	console.log('okok33');
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');
