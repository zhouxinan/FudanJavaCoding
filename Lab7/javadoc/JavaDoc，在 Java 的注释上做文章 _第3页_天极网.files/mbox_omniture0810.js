    var keymap = {
                "Hp":["����Y460","����560","DELL","����"],
                "lphone":["iphone","MOTO X6"],
                "Intel":["AMD","�Ǽ�2","����"]
     };
     /**
      * ����class�����Ʋ����������Ĳ���
      */
     function findContent(){
         var contentEl = document.getElementsByTagName("DIV");
         for(i=0;i < contentEl.length;i++){
             if(contentEl[i].className=='ArticleCnt'){
                 return contentEl[i].innerHTML;
             }                                                                        
         }
     }
     /**
      * �����������в����ض��Ĺؼ��ʣ��ҵ������omniture�ṩ��mboxCreate����
      * @param content
      */
     function doSearchInContent(){
		 var content = findContent();
         if(content){
             for(var key in keymap) {
                 var keywords = keymap[key];
                 for(var i =0 ;i < keywords.length;i++){
                     if(content.toLowerCase().indexOf(keywords[i].toLowerCase()) > 0){
                        //mboxCreate(key);
                        return key;
                     }
                 }

             }
         }
     }
     /**
      * ����һ���յĲ�
      */
     function createMboxDiv(){
         var mboxEl =  document.createElement("div");
         mboxEl.className = "mboxDefault";
         document.body.appendChild(mboxEl);
         return mboxEl;        
     }
    
    var onloadFunction = function(){
        if(oldOnloadFunction != null){
            oldOnloadFunction();
        }
        //createMboxDiv();
        doSearchInContent();
    };
    //var oldOnloadFunction = null;
    //if(document.body.onload && document.body.onload != null)
    //    oldOnloadFunction = document.body.onload;
    //document.body.onload = onloadFunction;      


