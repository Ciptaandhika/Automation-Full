<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>lblLogisticHidden</name>
   <tag></tag>
   <elementGuidId>35ff49ed-e1b1-4f9c-9a21-a0f31ef74507</elementGuidId>
   <selectorCollection>
      <entry>
         <key>BASIC</key>
         <value>//div[@class = 'product-info fRight']</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='Kode QR digunakan untuk transaksi di aplikasi Blanja'])[1]/following::div[1]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>product-info fRight</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
					Buku Berhitung 123
					
						
							
						
						Ulasan (0)
						
												0 Barang Terjual
												
							    	
					
															    				       		
			       								
							Harga
							
														Rp
								
								112.000 		                    	
	                    	
		                    						
						
														
	  	  	    
    	
	    
	    Daftar Bank
	    
		
		
			    
			
  			  			  				    	  			  			  			

			
				
					
						
							 Bayar Penuh  (30 hari)
							 3 Bulan
							 6 Bulan
							 12 Bulan
						
						
							
								
							
						
					
				
				
					
						
							
								
									Bank
								
								
									Minimum Pembayaran								
							
							
								
									
										
									
									
																			Rp 10.000 
									
								
							
						
					
				
				
					
						
							
								
									Bank
								
								
									Minimum Pembayaran								
							
							
								
									
										
									
									
																			Rp 1.000.000 
									
								
							
						
					
				
				
					
						
							
								
									Bank
								
								
									Minimum Pembayaran								
							
							
								
									
										
									
									
																			Rp 1.000.000 
										
									
								
							
						
					
				
				
					
						
							
								
									Bank
								
								
									Minimum Pembayaran								
							
							
								
									
										
									
									
																			Rp 1.000.000 

									
								
							
						
					
				
				
					Tabel diatas hanya estimasi, cicilan sebenarnya dapat dilihat setelah Anda check-out
				
				
				
                    
                        Ketentuan
                        
  							Anda telah mempunyai akun Kredivo dan pastikan anda telah diberikan limit kredit oleh Kredivo Untuk pengguna baru, Anda bisa daftar melalui aplikasi Kredivo yang dapat diunduh di Google Play dan App Store atau klik Daftar di halaman Kredivo setelah Anda checkout Limit maksimal kredit Kredivo adalah Rp 30.000.000 dengan harga produk maksimal Rp 30.000.000 (limit yang akan diberikan berbeda-beda sesuai kebijakan Kredivo) Metode “Bayar penuh dalam 30 hari” untuk pembayaran maksimal Rp 3.000.000   Kredivo tidak bisa digunakan untuk pembelian produk di kategori  emas (logam mulia), Produk Digital, voucher fisik, dan pembayaran tagihan						
                    
                
					
	    	
		
	
    	  	
  	
  	  	  	
	
  	
	
		installmentProduct = true;
				var pageDataJson = jQuery.parseJSON(pageData);
		setInstallmentPrices(pageDataJson?pageDataJson.lowestSellPrice:0);
		setKredivoInfo(pageDataJson?pageDataJson.lowestSellPrice:0);
		
		// Popup Height
		var InstallmentInfo = {
			showInstallmentInfo : function(label){
				jQuery('.black-opacity').detach().appendTo(&quot;body&quot;).show();
				jQuery('.installment-popup').find(&quot;.big-title&quot;).html('Informasi Cicilan');
				var Width = jQuery(window).width(), Height = jQuery(window).height(), popupDiv = jQuery('.installment-popup'), popupWidth = popupDiv.width(), Left = (Width - popupWidth) / 2;
				jQuery('.installment-popup').css({
					'left' : Left
				}).show();


//				set tab active	
				jQuery('.contentPayment').hide();
				jQuery('#'+label).show()
				jQuery('.installment-popup .content').show();
				jQuery('.tab-title').removeClass('active');
				jQuery('.tab-title[label='+label+']').addClass('active');
			
			}
		}

		jQuery(document).ready(function() {
			//installment tab
			jQuery('.installment-container').find('.item').each(function(){
				jQuery(this).on(&quot;click&quot;, function(){
					jQuery('.installment-container .item').removeClass(&quot;active&quot;);
					
					
					var label = jQuery(this).attr(&quot;label&quot;);
					jQuery(this).addClass('active');

					jQuery('.installment-container .tab-content').hide();
					jQuery('.installment-container').find('.tab-content[label=&quot;'+label+'&quot;]').fadeIn();
				
				});
			});

			jQuery('.closeDialog').click(function(){
		        jQuery(this).parent('div').fadeOut(15);
		        jQuery('.black-opacity').fadeOut(15);
		    });

			jQuery('.btn.btn-lg.border-grey').click(function(){
				//set active tab
				var label = jQuery(this).attr('label');
				jQuery('.contentPayment').not('#'+label).hide()
				jQuery('#'+label).fadeIn('slow');

				//set active subtab
				jQuery('.btn.btn-lg.border-grey').not(this).removeClass('active');
				jQuery(this).addClass('active');

				var label_tab = $('#'+label).find('.tab-content').eq(0).attr('label');
				jQuery('.installment-container .tab-content').hide();
				jQuery('.installment-container').find('.tab-content[label=&quot;'+label_tab+'&quot;]').fadeIn();
			})

			

		    //Installment button slide
		});


		//InstallmentMenuSlide
		// duration of scroll animation
		var scrollDuration = 300;
		// paddles
		var leftPaddle = jQuery('.left-paddle');
		var rightPaddle = jQuery('.right-paddle');
		// get items dimensions
		var itemsLength = jQuery('.item').length;
		var itemSize = jQuery('.item').outerWidth(true);
		// get some relevant size for the paddle triggering point
		var paddleMargin = 20;


		// get wrapper width
		var getMenuWrapperSize = function() {
			return jQuery('.menu-wrapper').outerWidth();
		}
		var menuWrapperSize = getMenuWrapperSize();
		// the wrapper is responsive
		jQuery(window).on('resize', function() {
			menuWrapperSize = getMenuWrapperSize();
		});
		// size of the visible part of the menu is equal as the wrapper size 
		var menuVisibleSize = menuWrapperSize;

		// get total width of all menu items
		var getMenuSize = function() {
			return itemsLength * itemSize;
		};
		var menuSize = getMenuSize();
		// get how much of menu is invisible
		var menuInvisibleSize = menuSize - menuWrapperSize;

	
		// get how much have we scrolled to the left
		var getMenuPosition = function() {
			return jQuery('.menu').scrollLeft();
		};

		//hide right arrow
		var menuPosition = getMenuPosition();
		var menuEndOffset = menuInvisibleSize - paddleMargin;

		if(menuPosition >= menuEndOffset) {
			jQuery(rightPaddle).addClass('hidden');
		}


		// finally, what happens when we are actually scrolling the menu
		jQuery('.menu').on('scroll', function() {
			var a = jQuery('.menu-wrapper').outerWidth();

			// get how much of menu is invisible
			menuInvisibleSize = menuSize - menuWrapperSize;
			// get how much have we scrolled so far
			var menuPosition = getMenuPosition();

			var menuEndOffset = menuInvisibleSize - paddleMargin;

			// show &amp; hide the paddles depending on scroll position
			if (menuPosition &lt;= paddleMargin) {
				jQuery(leftPaddle).addClass('hidden');
				jQuery(rightPaddle).removeClass('hidden');
			} else if (menuPosition &lt; menuEndOffset) {
				// show both paddles in the middle
				jQuery(leftPaddle).removeClass('hidden');
				jQuery(rightPaddle).removeClass('hidden');
			} else if (menuPosition >= menuEndOffset) {
				jQuery(leftPaddle).removeClass('hidden');
				jQuery(rightPaddle).addClass('hidden');
			}
		});

		// scroll to left
		jQuery(rightPaddle).on('click', function() {
			jQuery('.menu').animate( { scrollLeft: menuInvisibleSize}, scrollDuration);
		});

		// scroll to right
		jQuery(leftPaddle).on('click', function() {
			jQuery('.menu').animate( { scrollLeft: '0' }, scrollDuration);
		});
	


						
												 							
								 
								
								
								 								 									
										Cicilan tanpa Kartu Kredit
									
																
								
								
							
				        																	
					
					
												 
							
						
						
							Jumlah
														
								
									
									
									
									999 tersisa
				                   	
				                        Jumlah harus lebih sedikit dari stok				                    
			                    	
			                    	
				                
													
						
												
					    	Kondisi Barang
					    	
					    		Baru
					    	
					    
											    
						
							
							
																					
												
										                
				              
				                
			        							
						
					
						
			            
			              
			              
			              
			              
			              
			              
			            
			            
			            						
							
							Barang ini dapat diambil di lokasi yang telah ditentukan oleh penjual
						
												
												
			              								
			                	Tambahkan ke Troli
							
			              			                    
		                        Blanja sekarang
		                    
		         		
						
		           										
		                        Tambahkan ke Troli
		                    
																                    
		                        Blanja sekarang
		                    
		                			         		
												
					
				</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/div[@class=&quot;clearfix&quot;]/div[@class=&quot;bgColor-white&quot;]/div[@class=&quot;wrapper-pdp pt30 pb30 clearfix&quot;]/section[@class=&quot;main-content fLeft&quot;]/div[@class=&quot;clearfix&quot;]/div[@class=&quot;product-info fRight&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Kode QR digunakan untuk transaksi di aplikasi Blanja'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Share Produk:'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <value>//div/section/div/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
