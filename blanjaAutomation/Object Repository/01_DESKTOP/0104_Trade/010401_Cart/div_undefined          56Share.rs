<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_undefined          56Share</name>
   <tag></tag>
   <elementGuidId>e06a9d95-551e-4694-9266-12f70b9f6cf1</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='Makanan Kucing Whiskas Ocean Fish 400 Gram ( Wet Food ) Whiskas Kaleng 400gr'])[1]/following::div[3]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>clearfix</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
				
					
						undefined
	        			
						
						
							 							
																
									
								
															
							 							
						
					
					
																
												56%
					
										
					
						Share Produk:
						
							
							
							
							
						
					
					
										
						
							
							Kode QR digunakan untuk transaksi di aplikasi Blanja
						
					
										
				
				
								
					Makanan Kucing Whiskas Ocean Fish 400 Gram ( Wet Food ) Whiskas Kaleng 400gr
					
						
							
						
						Ulasan (4)
						
												44 Barang Terjual
												
							    	
					
															    				       		
			       					       		
			       									
							Harga Istimewa
							Rp
								
								12.500										                    	
	                    	
						
						
														
	  	  	    
    	
	    
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
	


						
														
						
							 
							Sisa waktu 0 hari 07:04:38
						
						
													
							Harga Penjualan
							Rp
								
								13.630 		                    	
	                    	
						
													
														
								

							
						
												 							
								 
								
								
								 								 									
										Cicilan tanpa Kartu Kredit
									
																
								
								
							
				        												
							Harga Label
							Rp
								28.500
	                    	
						
																	
					
					
												 
							
						
						
							Jumlah
														
								
									
									
									
									10 tersisa
				                   	
				                        Jumlah harus lebih sedikit dari stok				                    
			                    	Setiap Akun hanya bisa membeli 3 unit
			                    	
				                
													
						
												
					    	Kondisi Barang
					    	
					    		Baru
					    	
					    
											    
						
							
							
																													
							
								Dikirim ke
								
				                    
				                    	Please select state				                    BaliBantenBengkuluDaerah Istimewa YogyakartaDKI JakartaGorontaloJawa BaratJambiJawa TimurJawa TengahKalimantan SelatanKalimantan BaratKalimantan TimurKalimantan TengahKepulauan Bangka BelitungKalimantan UtaraLampungKepulauan RiauMaluku UtaraMalukuNusa Tenggara BaratNanggroe Aceh DarussalamPapua BaratRiauPapua TimurNusa Tenggara TimurPapuaSulawesi TengahSulawesi TenggaraSulawesi BaratSulawesi SelatanSumatera SelatanSumatera UtaraSulawesi UtaraSumatera Barat
				                    
				                    	Please select city				                    Kota Jakarta BaratDKI JakartaKota Jakarta TimurKota Jakarta UtaraKota Jakarta PusatKota Jakarta SelatanKepulauan Seribu
				                    
				                    	Please select district				                    Jakarta
				                    
								
							
							
														
														
							
							
							
							
							
							
															Jasa Pengiriman
								
				                    
				                    	Pilih Jasa Pengiriman
				                    	Kurir Standar
				                    					                    	GO-SEND
				                    					                    					                    		JNE
				                    					                    
				                    
				                    
				                    
				                    
										
									
				                    
								
								
									 
					                
								
							
														
								Biaya Pengiriman
								
									Rp 0 - Pilih jasa pengiriman
								
							
							
																	                                																
														
												
										                
				              
				                
			                							
						
					
						
			            
			              
			              
			              
			              
			              
			              
			            
			            
			            						
												
			              								
			                	Tambahkan ke Troli
							
			              			                    
		                        Blanja sekarang
		                    
		         		
						
		           										
		                        Tambahkan ke Troli
		                    
																                    
		                        Blanja sekarang
		                    
		                			         		
												
					
				
							
			



                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
			
			
				
					Produk yang mungkin Anda sukai
					    ???                                                      Makanan Kucing Whiskas Tuna 400 Gram ( Wet Food ) Whiskas Kaleng 400gr              Rp.14.500                                                                      Whiskas Kaleng 400 Gr Rasa Tuna              Rp.15.000                                                                      Makanan Kucing Pro Plan Delicate 2,5 Kg / Proplan 2,5kg Fussy Picky              Rp.258.000                                                                      Makanan Kucing - Maxi Cat Repacking 500 Gr / Maxi Repack 500gram              Rp.15.950                                                                      Makanan Kucing Whiskas Mackerel [1.2 Kg] / Whiskas Mackarel 1,2kg 1,2 Kg              Rp.56.870                                                                      Makanan Kucing Felibite Tuna / Seafood Repacking 500gram Random Bentuk Ikan / Donat              Rp.14.300                        ???
				
      		
      		
      		
      			
      				
      					
      						Deskripsi Produk
      					
      				
      				
      					
      						Spesifikasi Produk
      					
      				
      				
      					
      						Ulasan (4)
      					
      				
      			
      			
      				
      					Makanan Kucing dari Whiskas, Whiskas Ocean Fish 400 gram ( wet food ) merupakan makanan kucing dari whiskas dengan tekstur makanan basah yang terbuat dari ikan laut asli. kandungan gizi yang seimbang yang membuat whiskas cocok untuk memenuhi makanan harian kucing anda.aroma yang tak mudah untuk di tolak oleh kucing kesayangan anda
      				
      				
      					Spesifikasi Produk
		                						Dimensi : 5 x 5 x 5 (cm)						
						Berat : 0.5 kg						
												
								                    
		                      		                    
						      				
      				
		                						
							5.0
							
								
							
							(4 Ulasan)
						
		                						
														
			            
                
					                    
                    	
					        
					            					                
					            					        
	                        
																
										            						m****m		
	            													
								
									
								
	                        
                    	
                        
                            
                            	07/07/2018 11:45
                            
                            
                                Rekomendasi seller
                             
							                        
                    
					                    
                    	
					        
					            					                
					            					        
	                        
																
										            						gilangmaulani08_gmail_com
	            													
								
									
								
	                        
                    	
                        
                            
                            	04/12/2017 15:32
                            
                            
                                Produk sesuai, mulus, packing rapi, expired masih lama dan proses pengiriman cepat
                             
							                        
                    
					                    
                    	
					        
					            					                
					            					        
	                        
																
										            						gantinihani
	            													
								
									
								
	                        
                    	
                        
                            
                            	14/11/2017 08:57
                            
                            
                                Barangnya mulus. Kadaluarsa masih lama. Packing rapi
                             
							                        
                    
					                    
                    	
					        
					            					                
					            					        
	                        
																
										            						gilangmaulani08_gmail_com
	            													
								
									
								
	                        
                    	
                        
                            
                            	27/10/2017 15:38
                            
                            
                                Produknya sesuai. Tidak ada cacat dan kadaluarsanya masih lama. Thanks
                             
							                        
                    
					                
            
            
	
	
	

	
    	

            		
    	        	    	
				
        	        		        	
    		            	            		            			1
        			        		    		


    		    		
    		    			 
    		    		
    		
    		
        	

                    		        	
        	
        	/1
    		GO
			
    	

	
            
	$j(&quot;#feedbacksCount&quot;).text(4);
						
      				
      			
      		
		</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/div[@class=&quot;clearfix&quot;]/div[@class=&quot;bgColor-white&quot;]/div[@class=&quot;wrapper-pdp pt30 pb30 clearfix&quot;]/section[@class=&quot;main-content fLeft&quot;]/div[@class=&quot;clearfix&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Makanan Kucing Whiskas Ocean Fish 400 Gram ( Wet Food ) Whiskas Kaleng 400gr'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Makanan Hewan'])[1]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <value>//div/section/div</value>
   </webElementXpaths>
</WebElementEntity>
