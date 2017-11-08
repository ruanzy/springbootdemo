$(document).ready(function() {
    $('#mmm').on('click', loadData);
    function loadData(){   	
    	$.ajax({
    		url: "http://localhost:8080/user/kkk"
    	}).then(function(data) {
    		$('.greeting-id').append(data.id);
    		$('.greeting-content').append(data.content);
    		var html = template('public/aaa.html', {list: data});
    		$('#kkk').html(html);
    	});
    }
});