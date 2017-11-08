template.defaults.loader = function (filename) {
	var tpl = $.ajax({
		url: filename,
		cache:false,
		async:false
	}).responseText;
	return tpl;
};