/*
URL 알아내기
- request.url => URL 정보 추출
예) GET / status?name=ryan HTTP 1.1\r\n
리턴 값 => status?name=ryan
request.url = status?name=ryan
     
 - 클라이언트가 보낸 데이터(요청 파라미터)


 */

var http = require('http'); // http 객체 가져오기
var url = require('url'); // url 객체 가져오기
http.createServer(function handler(req, res) {
	console.log(req.url);
	// url로부터 경로 정보와 데이터 정보를 분리하여 추출
	
	var urlInfoMap = url.parse(req.url, true);
	console.log("URL 전체 content", urlInfoMap.href);
	console.log("URL 경로", urlInfoMap.pathname);
	console.log("URL 데이터", urlInfoMap.search);
	console.log("쿼리 객체",urlInfoMap.query);
	console.log("name=",urlInfoMap.query.name);
	console.log("age=",urlInfoMap.query.age);
	console.log("tel=",urlInfoMap.query.tell);
	
	
    res.writeHead(200, {'Content-Type': 'text/html;charset=UTF-8'});
    res.write('<html><head><title>test06</title></head>');
    res.write('<body>');
    res.write('<h1>오호라 이것이 노드제이에스 </h1>');
    res.write('<p>자바스크립트만 제대로'+
    		'배워도 서버측 애플리케이션을');
    res.write('개발할 수 있다. </p>');
    res.write('</body></html>');
    res.end();
	console.log('okok33');
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');
