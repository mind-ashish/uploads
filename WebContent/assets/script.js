(function(){


	/*$("input").on("change", function() {

        var file = this.files;
        
        console.log(file);

    });*/
	
	/*$("#input_ui").click(function(){
		$("#fileInput").trigger('click');
	});*/
	
	
	
	
	$("#input_ui").on('dragover',function(event){
		event.stopPropagation();
		event.preventDefault();
	});
	$("#input_ui").on('dragenter',function(event){
		event.stopPropagation();
		event.preventDefault();
	});
	$("#input_ui").on('drop',function(event){
	
			event.stopPropagation();
  			event.preventDefault();

  			const dt = event.dataTransfer;
  			const files = dt.files;
  			console.log(files);
	});
	
})();