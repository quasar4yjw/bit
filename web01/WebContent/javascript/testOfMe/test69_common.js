function bit(value){
	
	var element = null;
	if (value instanceof Element){
		element = value;
	} else if (value.charAt(0) == '#'){
		element = document.getElementById(value.substring(1));
		
	} else if (value.charAt(0) == '<'){
		element = document.createElement(value.replace(/<|>/g, ''));
	}
	
	element.text = function (value) {
		this.textContent = value;
		return this;
	}
	element.html = function (value) {
		this.innerHTML = value;
		return this;
	}
	element.append = function (value) {
		this.appendChild(value);
		return this;
	}
	element.appendTo = function (value) {
		value.appendChild(this);
		return this;
	}
	element.attr = function (name, value) {
		this.setAttribute(name, value)
		return this;
	}
	element.click = function (value) {
		if (value){
			this.onclick = value;
			
		} else {
          var event = new MouseEvent('click', {});
          this.dispatchEvent(event);
		}
		return this;
	}
	element.val = function (value) {
		this.value = value;
		return this;
	}
	element.css = function (name, value) {
		this.style[name] = value;
		return this;
	}
	return element;
}


var $ = bit;


bit.toYYYYMMDD = function(date){
	return date.getFullYear() + '-' +
	(date.getMonth()+1) + '-' +
	date.getDate();
	
} 