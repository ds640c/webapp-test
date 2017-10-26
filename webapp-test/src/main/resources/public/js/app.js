 
 $('document').ready(function () {
	 
		$( '#click-me' ).bind( 'click', function() {
			$.get( '/name', function( data ) {
				  $( '#name' ).html( data ); 
			});
		});
		
 });

	
 