package programs;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static programs.PrefixSimilarityCalculator.getSimilaritySum;

public class PrefixSimilarityCalculatorTest {

    @Test
    public void shouldCalculatePrefixForWord(){

        Assertions.assertThat(getSimilaritySum("ababaa")).isEqualTo(11);
        Assertions.assertThat(getSimilaritySum("google")).isEqualTo(7);
        Assertions.assertThat(getSimilaritySum("michele")).isEqualTo(7);
        Assertions.assertThat(getSimilaritySum("ifood")).isEqualTo(5);
        Assertions.assertThat(getSimilaritySum
                ("xttkqxwwpozxxiuumczgbxmjqfsvusemveymaemlagnykqkbzkksfltwmgxstdksktsnmqpntzqcizgssaejipwsjimoxikykhxgimpshhgptrdjzdywhunbgtadmnuecmauetmyoikmtwokoqovtbheyagpwdihuwlygoqhvsnuywpddgpmrfixxaqnyeyogpjgiebafqgkunlkomkrnvsglyavctsbujuvlftnizfusastiurboinmaclgzruuwdtrbzhjszhyldasbzucnxpzrwlhgrmxqeqtbuyxikndpdtcdpnaeyssbsgacypsyphjvxxezraqzchircbdqbdfucphwvkhcfaldwzxpuxqbqibuhvkfohqhycqpqokeinuddzfzjwrbdtuhueubsqbwxgdyewohofvsgzgufkujpafkzzqsjndsfrnvkxnexsifzvclemttdxlrhcyfekyadnkcfkwqhpsmtynpcbbsoxzhmifbscvubvfxzvsmtppxkxriiibouazdrjyeyyrrbrbtxtxpkiyeeondqbmczkoxiblcmnhkicxkuapzhmwiqaysabhldagslppfmfyeosunjmdlivdfmgobunispfshkgwbopaqwivvxvblnntfzyhcopolilvhunlkxiaelfzmsnxbioqlftauwzendsnyqlqtzvohndkxaugfmxbtyjsjtcwrkvcsbabzlbydqjkkgfrmptnmdymmbvuhufcixchscwzviulcbcnouuyxwxbxfbokvdaqvrdsuccbgfhtmydqadfncntsqvwaebghbcbbdciyyxasvwynrsrewugklccooehfqhabioeqdxhlmovqbrzfulcnezilhwzphgdvwasuutplangcbqroawpjlukjudwgnrgypgrvdrpcmwhymyjgywbttwkvahgkyrtvymevxnvruyreuszxxgcnnzpslpawxwtrjarrakxxiffpcwqjgiwhfwhytbdqwftvaliufrwfewuvinguaauruwpxzowkxxrsjujdjoywzufjyidakyayshpjvxczojhymviiasokqspanckcwlmltuckxffiwrjqydvhevqpzqmrsphdbvvwimtnmibjbhlfnllzfqqajfckjzqgbnpdasibprxrqwzavqvrfpqaqnpwkgwfbxjtwsvtcfpjyvhvptieuuxmpurszqyofuiktuvonmymtqraokuipzphpuiiuwljoprpnhhyekenltbbescaxvkbtivhlizggymivecmbicyyawoyytpeeatoqxsqghomejbatjgzfxkptmciqvhpxbbkjajqytqoavzazoxovikjbwcwmnpfowyuufcwgfszrrqndzxhtwgezulbpulrczycsgjjgjnupbuntsapxbslgwpjsgvawafssdlppuwgabaexvrqzpbxkluqqtwzswcetzqqynrbutfvhhvzxmyzwqulcbfogrptwdjtqohjuwxelofyhiwiqpktnyavnowswtoqqzzoqvozritogdmkfarsedmvhvtxlsqixhehwdbgnhizjrsinwdpbguokdrzhvtvjucmvillitzuzhwtjbjifzaxocxswarnzuvovvzuvuamefyowppmjgtlxqfbruychrpbqemnxdwfjmrldterowjginnjamiibmxukicbbqzhyxhbvmmswaesbkkpxwyeiwraztwklamwmeeigrxnvcjtkyxdskqiyimtmlbpnrpofyzzikotboisgqocutbohcucjodijjkmdlqhmgaqhqepzksazyaxhtsjcoyiarphudtmyhenzsanijadoyansxxwiebfepqopkwdvkaykbmbxjjixsgthafhvdhhoemipozdzwckzchvomxwgnidypgrzrhpykabodctccurhopwwpgzdjtgswtmglzcvmiygsaipvenguslnhtjlqfswkqtulpffpfvcghoxyqfrdjdjfhvrbdvnrhhmxuvyatvketcckwfvbymbzehazaipevorxtmwmshceempgwwsyfcpjtdcblbbevgslbmhneqtqlajvskjoawnjwrzjsfgmeydaijynwjnmffpclzzrrdodfgoihenelsytpeihgnyubadwuzrkpxtattmamkkagmrcgqednrkfpqsawfuapjdqiqtnjagcmssdhilmbpfaafujpolpetjeqponzgmcnqmivyaqodpuegmwnnwemaduwqjgrszglhqgokoqembzxkaifxbgzbriamnetyhtnyammutidvgsbdjpivgvlrgnjkoionnyviexpzwismsbaaoaqnccsgteokjswhbsmqozoxlikkzyqehvcshspwehwoflwzlshafrergxgjsdjztrptwsccuuigmzawrnmoaddilpdrsrqyjwmnzoloeiktnfpswvdioiikrctqtyviotpovndpijrnxqosnvngvjtjlczsgqemasrpayduhkbovltncefxpwhlidefxprtxuujamcdochlzofyzxhmjcmcwelcigmcygxkuefrtdefatylmsixqqqfqodxzateezmikyrlpsoyrdzubbosleczlzvgizjmyxawkrfajwaytujxtgpcupnwpcpzyncshuzaxigzhrqofxfsgykcgabbzujjwdxxcxqqbndjdqmczywfcgllbqxrsvbabpeayeevnlgijwigxrhuwdjwnftdnptcyuvzcxdprwohntcnpeljfndjbudskbpgnhqwcbhfehiwaatlgpxalnkmnqwrndzbvymjhdagdjxvpttbplpgecrmjjaghcyyfqwhjqrqszrvfexshuhwavovzfepqkolyvnxynmdhvxgnmmerjocnjkmoyrpooeenwyozjeysodawyzqksvaxowllkwaluimqmqwebtyrugoawrhnjcnlphrvuljqhpycjgfhjgqwvjlhnsspqbnemitpvslotemelaqkqtfahnjiezmegxobiruvgieivhwjefolhvjeihaamibklahwcvecxrooyrodkrosmigycktgbqgdyglqfvlrlmnkqpjwtldmolfztjesgrwvqoeymcacqkolosygpkhjhkigfdxpyukuilawgmfofyosqiwfdecwwubforeccwowipdbxkiieajdnjynkmdtpccnjsnmssxwbcjvtqeojvskvghlwkrpphdzfkiunowjtugpjhbzdsovezsnywveckttmbuneqwqlztyupyiuhucuorwvdckjhbmtjmtsivsdhzedcmocmxltitsvsakrteerwenlgwpszwtuazpfyfmuvifhkkuknplrzpqqjngnnbvaosidsiagvlqhabrmwfonxeygrosqamvaedvcwazeiwupghdlpxkougoftwdniuspehkxwkxsikzqzjryjxhsayoqtskrqfidlhkmgtzxmhagqwploumvvplvgcfqdizfggjzfxaklfqnbnucfjlbizzwnvxvhlansgyblaiiiqaxwbewwscnokjxqggnxduuepktyymvixnkmwmhflqkbxsnadjniytzzxejhgdzkjftiruozscqbkrmpfszhytbjuizfvwodpchiswapgzjokldnblrvsyruxwdyfuxkkcdlshlxwquzaikisifbphiztygzcvodjrstcyykcvfyhoikulhjnkhmzgztiboasyiowatomchghipcdukilephkbkqczrcphwvqwhvdagncklktfrhshbkhwnhnidmfomnstbfhhekdkavpnfrcbnyfvmdctgelgltiepgfbxvqavkofjydfxcntzjyrevnjhzlrflhhqiptzqmlswzxnxpjbhktbujquizcfyqbjsyjipxsjrvroalbnnzkvsmbppsittypzvxkwofdctnyfqzquwxbcfoijdqtierfepnyzxqwtsvzjqaqabkefesbudhrkokpdpdzvcqqcayjiqwidfgjwudqeqlnbgiwvxfaalwlwgwdcwzkdunkvvidbankklvazuhijkzsqribziwcocztvfbipkllelimcsjdkcncfftmgftjrbwkoblcqggxzopvwoytxpmeteyvmzzhexebjkqeezucwogjsotrssalswrulwrlqnfmeetuaqiamhkjgvbhbawawkadcrirqwjxzcetxppirkisjqybytubddizchdfpifbjmvwpevmicfrsjejtlxxneapoxxxjuyylctpzdupfwpcvcbibnyvkhjkcftylrksrklucvigbydhkxeymtusbgqjdhjvqbosnehrzjpvwexcvyniggqbjjchxnhnwrtyygdeipgdptopwgqddgrnsvmejvtodgfayvzewnqksjljfzclaqknsmycqzhieglpocmnvaghqodvzggwvhtxdgiiozjphagwzvgikrcnbddygqexiiaahvaxwzozgfspmokpxjbvzrdznoqulkueqvdbjjkqnjqcichiagrltkmarteekugvsipxgyvexlejunftrjqbulwikwzfvunygkgpbyjcohhaffjmyjldrrscrvutdzelutguffghueowkoxzvsopvmobkkiyfucosvhjlijttevvcekdolqmzyglokijihjowobtxyafaurymtswasdeuinwldcdszjboifaekevcsygrdrteeowjwkgfxxljhuzdhfqjpyiretbqqiujmhpswhbewcqnoopkmtqakbopcarocpwvptpohndejqdxilzhesyzgitdqyscpjzdokaqzprcqehofdzhgcfpkrichqjmdfrxubscaesohsnyojhsmapudlocsrqaljhlkbdtynogthgsiccsaefakpxxtikpadgnxvaumspewqzfaxlefqwbncarqaflmcgjltlnjrsoyraozaevetdvijhxqdvmmdeylhdtmbehlnkyxnrjsurtlogiygbwviayqcssuyggozwgawhrkdgudflnpyzywiduktfwxukkigsuuymbxnyelakhjbnmgifwqvqhwgjlmozxhhjphzlsaahzepujxunmcuucfvakfoyexfeujxwlepabnndigiyhlhtwlpptcbuzznyedftxpojboawgpgpujqndvddbieeblxnoieexucifjhgmxsoxadwshmtqsrqeguayolrhjpalujspwphvgogbgnxdktmsmbzhilvbyxbfjsudcuydqdyhenrarvhcueocyjquoenhiwudtlhphdkytinducswwemsfevhcqtzcutbtwwdofrymqnmplhagwyismzdxwkvtkahryfkbaeqnhuycdzrlpntsruwyacvqssoifhkyvwnhjepstfikbyvytncsiqvhzdnhefmrysqcmoqpxmsozciazbolehaodkswdifphvldmqmldzqjgwkafuezneceohsvtuxytroswsinumtvghugnpyvifbjmrithxeykmjevbnzgmmtokqpexmiedzbbhrlvcnapdoqwpqxipvgvvzripkwcazovpltwxyrgkkzxtvwgcbfzcchxoftpvjzencvycntachxkdhezwznbbzozyrwemgydrnxszcjkwmacmyrazvzzrwkoixacmnsvtvhhmnrvkifuhojhtaaesghecqvkzddomrrcsufulctlwgdretjeihtxmjpylirxzwtrvtweexzdsckjcqypglhqtkulsgxzukgcpmqgkefzdhqvvgmhmgixuaumcrpldnuyiwsfdpojjiqonwyxkcwzugqrpsnsfslpljcbaiomkqntlwwsnmcdnjkjcvyfiuorpfcmjkrbgifluxliztqbznlbcnxfvwcqwbnknkjyllxbzaexihevqcneumvuzuyammlwxvcwmlilbsnmmbzckgweoavheapvowpidjehlghjcbdcmzkfhpbzxqcfkfhytefpqvadqaibvvgvquwdbjygdemzvbzxsjymnlfgwhbpuiozezlhjvhwegthkhzduebvinpbvhzpigbjnptdkoyqbaioyyofaaeqwgyzrmhubmobrhubgkfjjlfzqoxekexnoxiavnbrnlelnkunkajdisiaqlneqlfvxxwymtvdrsrxkgkrrilmajuakizswkaenuwjjoibvvhypzmslqqfgayiycopgxthjrphpudptaiyjbfrsyhwnbotdldqiifqzqvqtgzltbsvpngmbeatnsrkgrwigqrqozfccicwgcfubvylffkpsfblbbfwiaumeyazishpqqawuexawgrgzdioktzohjauyvaralexicqumtavfzwgapskrmohxbzghrxdmdkcdktkcqnmogozywihwrbjdpqxgbjyzfwmajipvesilycukupkttckgedmponfathbgtpavocrspxezyticfwxvxjembhcuuglsvvxxfsljdkxrwhatgufzubnrdknkaywtyjgiyphvpnkkpilxioavndwzpnqsenojilxrygtenkadphgaxlwzbdkgagquvcqacrmkbmbbxfrmnyuyxoaeyedjpdnisjywjaxutmfmanbtmwblkcsnsrjebyuvfadcnjiktcxijyzgcheeiepynkshujxmcrbiiehbgolmwqaeeqvmgkeoaezvmewzwpwjhznkudvkubsolpzwzaiwmfpxkhmkbfvfsjqfbrnmebizefidbkqclybpifysisnhffxrvndioxxgiwjyvsfdxwtuhruuiwuakedshjgkjwdqdykdzdawudnnoucfefmkhhuusqoxpvkpsdepykudjpfeaqskboteiztwfqowolgparuucfownqkozcfnndyrhdnfcqohvflvegypywwwrvljvxmshoyevhhtsfgexrnioewjxerevyqvgtdnnijiswlwjvegsxxazesgafxyllotroneyiawhgexprjrfzqnhnxmhvqmupsqcllnsmbwyrzsiwimixmtrbzcsefgdxswhsgyfojylpnjvwbztspdhwazezijewiktkibizdtdpikfxffysogojyfsafldluaklqqxflontgwvebyycjyayrfslebahbpdfgyngwzvsuteasmcxurctjtrukuktzpddwggzulkibnmutbeupqfmqplvvqwxcegzuftvwqaxnqzbdrlvoiljzplbhnsdywyucqjftydoczgetrumeytfcbuzfpmdnsjlnrfzjfdefjftrnbfbfeuqrphhhvnloslfxqgqvxbilyilkfpppkpgvlpwxsllnkatiqeezabenymbcyzjlsbujfkranovshijttepboduwyrumaxwslehixjhfhnfjpuhojpolmayrcrxmqiytcdvgtwqhgylkiwsqkbabgewstjxedcpckzrexfvhhjlpvpoodtppurriiuuptdkkvuejrzhvgvkqfavuozkwkwguhfvitodnzmqlkmjjycrezfuwibkchrnwfeawtifzltiwkbcxdcyxbaqwockniydtenumbbbyqlydqxqatfqhyychvlrcraqhvejcyixgbrpanbjubzglhodzbsofudsaqjewtkliarzogmtlnhxhuachfxpasjiahygquadltzqwowgpbcosyoizqstqqiggrjawdunjxdronwrubuwreubliwahlbpkgvtipkrnqzwlrmyvrchhhjvurdniagoaidswilgocytjpebusuimnsacbmqcouygxyzgqueuyakovmcrihynadvtptjfuiegleamcyhselojvvnmhtpclamnnbamxbgqeldnvtlcrhkvzgfzeyhcccdetbdmoenigvxxvjwxweyixwcokufttqpcyidztonwyoohicsertwkbuwbjmaotrgmmyzepormeihueypazzilpdvmzfflgeyrujdrxhxxxijyiynqbyibyiztxlvpqunsfypyiwpvekqeebcmbszifdtvlmddhhbwmabbtticzakcimbhnkvnvcjrdrqzsorlybebovtboembaummldkbimtsbownoohujhjgnsbdqibgskhbofhdmihgjocnutzgujovbnvoyifwynnzwhhffwrftueosgcdfscbxuddvqjgmxurjfyjbgltbzeynbodypavgszgpooliyyubynhzhqkooyoqeqpuzubqfbpumriqnwqidimqayzjlyxzeorjknclgcclzdyljrtjnlvqkoyntlpfikfcrlnfosucfmkovksxjuncxpsiuxiqyvheppmogoweuefekeyikhevcecoevrtfqwakpijjyxmlznkrioebyedxvauszuvcftilbffkjcjdlhoudxsgmcpdbrjwegmpedeoejvafrwkkjzqguowsjdoczrohelpnklmkymtdjcscvjnujfekycmvywbtudvsjegmtfncmyghftskoptworuuswqzpmcdxydhvaspnkdroytuugluurziyavqmueseohuhfxdtzsrwyzeoccxtnietfogcplcvmtfakzkoblbpmiiqbslosbcrmabiiclgrbzagaiiizgcotksihykgucfqdsovclbkplyivfhtylwzesgosiignvreukoklzirlfnwfleqeodomxplbhapyzinynqhplcraajbqskweorhbwnqfswgnkprylsdrlvtszvgqwmdqwyxkyjnemdtfbllkqxoojuhbqxgclpnlyrhezszdxcxkqogkqyblsxqwgideoowpvngfhzvowyouininiqpipvgxksygtcerktmbzmtzrkjqbdkguwphwjljzttcordttfuaoykugpymgthkwktqgwgjxpwffliyaykyaqvrxboyetljfhkdatbovrdbbtgblsicihiejoausiyttzegsabikmfhrtppniddygdzaxukltqtiaumwsbwowsebganfzqjzvbhpmmokodlpdnlsfofukbfhmvbyfophskfbxtnogzruqzfrkappsibwwlndgzlfchdebikylaaknijizaogiwopauvsiklthkkdxetvlgjzpkixodbusaabswfwlmndclzngoiyhktsvunnussvhkclczmcibdfnnhpxdfjvwbvlavmxedsgywfzfjtbbuljvoijgbcorgxhljfssrgozskfvflzxxmpkoygxbncnpyvlckbbuyalknatdczbmziewfnwsqqvthuoqtbrxpeuykdddfuulhzyjbxycioroszncnyqdrbmbvvpsmwbtwplbwabbwnpdkwyyymyctyashnjqlcnmfhihywweyggjvqxlxiiomvhihchetuvxsxvvoepapptwgizfwfztfhyfwkngcdafveyfjwsmkolctrhvvyxojplfintaejgcssrgsuabsfrbqozquypgkqwitxbdvifwdgrehpgeinhgijcvtxremenfwhgheawrdafocrziuapdtulfodrokgpdznkaoedeyhrquaaixrnnupcvxhqjgcmvlinlzppdcmbrxgvwckydugesmdizowaaqbcotximxoyydaxppcuyknsbsgyqlslshgofxvmgjynkssatpxeemypmfssxphmaztrbrvamejdawhnkrbdrcwrxnelqjdekcajtfoiqihmotafywpmsexyacwpfzncuirnrmtydnvujqduxoewpnjaarczdujnfvwapmrxiqywemlwielkgplegzwximwshlutwlrkvaxtorqmaoexfjvljnwdizsesvjoyifxvqbqxrgzbwdjegppbbceuqixbebtjvcnyqpvacckwuceslccuomufrguqhcxwqysyfswlnohypvqjizsaxlexnpccicfxhliqjmublsurfqixbhwbaldgbzyzvgqwvozfaqewxgdvxzbcvzavipndlgtnetexmrtdtstvgltsbtcnbdrlqhkzknzenajuqfgkdstylbnftivbecoesscvligqzzyjbrsvhnsgboaypdyczdfycktqsdkoovccfozvcfsbgwwzzvlqusbtbavpbafozosclrbfawmwopqvmzthdzeutmqcwhcslyfznrjgjeozjifvtvnjjbgkhyeghsfwudlytnyanvtgpznnfucfvakqkihgtoojwejfbiuplxtvuwcekszjkfghtelqlzzpggaskpkrxfxexqbfrrsjbzamyhygfggnciqkbojpznlfmhkhlepbsucsibyvlqkjpvrhwrujwdpygzipswuuoievsoyzvfkqxqbydxyckmxxrohdecmdrsytakuykqmifzitqtjycbezhfytdhtksjmhzkxffmwlzpglhljzaogejyfxdhyzdnkvnfledlxntpjsucemrnaagfpudyolxxwyhbdclbvipimrfmnvozmsyasmgborfipmjctxrgpkdnkqjhpwbvjihqygthynngkpgqvjwbansgbnuafkwnlavcffnojrxbsdgmuzbtcugbxtskkxjfauqyivnaxwqnjjllshfqxeccvqeqxwdtwxghxyaieaojqucevtbxkoeduxekecuqscenvlokeguohoidfezyhvqnerkongxeecfqqbzluusrkvitgyolnojazpffvhhyefjugzujiqcwnesnruvylalhqcqkhvgisxsmtmovwhqaioaugjrqkoardspcqfwnlqbdcebheiuajxyqttediesagwhxxfcmmajtrjjrxugsnstahdgjfkkwnegabyltffhqvlzdilqggxvirgqrbuyfnfkxrbemblqnzxgiyntezrrekcpczoeldrftonlexjlpveihcxnadjvjlwjwpxcxycrvqnxoiqledqinrnseeijoifbofjrhxddjpchhpjgfexppjbgfkjmnbqtqocslsmnvhbjnmufabmdgwuiaubyvkczjyukdbjernzlzqvirjespsmaihmioeudcjgpuazrxyfnqamksundaxffiadjkdmepwvvphdzfnyayhenkbzsbvudonmxvuccatporbwmarjfrmouupctslmbspbkduruzechjtzxbnewdsdtdhvctltzvytvoqaeezmugnghwomjmmhlfvakyshekqmsmddjyurroomzlbbqiykbeblmzqxrxretfbyffhyzwtrcbxjyqvjbmddshygreidlpqlhenqxncpwhctrldobcprjskauritfcvmyjbiqzvcqppcaazrhgiheylgngonblkyprpypevsngtzjtefykyxdqlarpiuvucuvywwuujvpvbsihmprvdokrkvswwwfghhbfitvxkwzmpiocqvqnsraufrwxhlbysxvhrpakcfegwdyknagmmnjipiepxpzibiwkealpaoaxpekjlxkvyhsygciwtkibojtcvzvfxfwibssvdxszfcdazczqrpafranqayklaltxgwnutlwyjgtxckssawzdrfaepaqojmlxbzopupupkzogxnxjxajhuztapkhtechbtrbnhpfeztmobmihpwlaeluotnvpxikhppskgggzdddvvdmlktwvoajzuplwgebtmcgcpqmkcljvncenpomkxatcytnsfdqyxlhgranoncbkhqsxstloraxtbbepozdblsieggjmrejcddneatagopctmvbabfobeepdlrqzzqbrqhkcwcwcrmxhawfkvubloqcqrdvlzhadsaslwebzhjxsunkgwrczvfkruvwggspwlrpqxtmtbcvtavldwkvycavfafldoxqklwkymyascueuzqqwumogkcsbdhfkmhuogdjxzcvrqcrtskreuegefzwtqfprxhapaggxmycfszonokvymxmmksepuhhohskaaihmoxrixmjrowncvqdcdhczujwpxshcrsfcsxqhtoeihhazslbiwwaxuhjyweofrgdbccwstynoplbobxjubgtdzzgcniannwenkjsupqehoybnlauzgxcnwgonmvxaedfnqoqurzyjcifztrolhtmhhcmfczxpcwykumhgcioijtftrvlktbvchxkeoezzqstlpifivtatbhxxvulggsnmaggrdfjhirdxlrxgpkjtikluvffsjbbhmczfwwfgewwketfguplfymrdrnyjneytfuxsfcxurhsaghyhdopadjjzkdjbkndknsdnuknowsawvzoevifbptpgjqjsiuldbjecmjagtitilalfexuzpweorutasbkrvjiwilzprwfjlmwptfygppfreuynrmvtwfnqohwsjruzqredtzqdssuwxtbjxaagxfrdvlwbvnzibavgnsifmslmpzfjjxgbggxlswohherobakzojrdlobsybrratsuuaxzbovcjvmfwblcrbqdyreittdlikhdwrhaiviogptxbopwkjffnypfrzdqoalbmcivxxapzijpfijvuirlavogdeiuubgmwwyxzgaitvhffiflrppzvgxcaxlxttitjtnkplgimhyqywobpiebbzxmhvojfbvgqhlwdiazpsroscazmoekldmjtiwgkwblqydnxivjhnnlciewnmfqcxonhxphajstzkmeivjqjolulhmzqtmmvwoqxspmzfueijzgadsfpljmzihhelxpwnboecozgzxsomfnlsklfjdobfosldsgjeimutfttkmhscwicsxxhlakjlsbkqwjwdpbarnurkmlspzyqmtllamybowiatjenjowiqedpdbikzvztraggdsufiubpevnqwcicmldvrnwucmeelbjtgbwzxukfoppcyatinxfterztptylndzhcohcljioetqojisbqruvnvfuxonjfqgllxecqpjfunmclpfctqbaybzsivwtktfomhjbbltgmhqicqroaomvjypuwckvpzjvrazbzwpgxferegwcelzzwqcxvuraknoaypnzbkanjcrkcdwpraoowrvvokfnnupzysjmfzzbnyauwghtmouowhlaqjqkajdmdjwumbcwljfqcpzohncfqziwvirkjqfufyuaviedzvfhcdhfnmupfmmzarktzdjfxgwctsogiwqazoyoqmsjarsreesrdxwggljhyresgakrqeelfufikjrozetgnfymrbvlyhwkpxmofbvwhsagnwjejvzjhwqqmmosydgruhcdjuyaqznlataujqpiwbqinffhyezzejpmptrularfcrixnubjjajujqjwwjlywlwxppuinbnuaeqpfabifmquumgbmhcztfayhnobumpsluuvlfpmzkbhdpxqliunvqoprfuyrcaelgrhqqajpmckqyyflirawnmjclycspgshzteymsjizmingeqtmafytbogjagtjzgybwvehvefgdamnvyqtdyuqjkbamvohxqbicpytrxnmsfitoaonshlwozyizuponksvynltqfccpxcczturhmiupegkfeazvufelgedsbbjkkbvplgkdfnucinilzrwegujmathdvgbyvysgjjzycflufhqjdihgdlhfmdeyfrshxyecpqxfmjvxjnzwyiruhhfblcaecyauekvhoeifehhijopukdqvchucgpctzhhyddupayixiymkpngcowlgkxhyqmrdjpfhjwbfgiriwbhzkyvuadlovklcwdvbcpetzzorwtrwteknlpoeqhzporwyolkjmgdufwcpudjjkgjtfqzipdqcztwwmielwgtdhhpttemkvktniviemapayuqiudqnqdkcxfesxmolopvgngihtlnyidohyhjtaocnhdlmphggjguypnshjybofvnojeyoiuguktlymkjsurbaoslaadtnrscycmzpehufguddaiiymgelenxirusjszxomxzlofzorhfpywgueduhjmpsfcbajbothplajfzynuvlglgytyeybwtmkzvqgvhhzrnnicmmbyhyeewufdlwggovzexhozsnwjmjrzpldoasnkmvdsogddmlyaxsvxhpuakmjflzwdgkgxalhfyczbcnigokiofzmiucchotgxyqbhyaazsvtayflgsclgvecgetsetbrnzidzaoexjapbiahuqepfmlupzvxregsnmtnftqahqijoteeppmkjmqhhupholujzfhcmixrvusjgmnloeqqtmurccikwuqnsdedfkxltaefetubzlkldbvkteicijmvtuwjfnpleiwnotmcikgqjegbpivnsnkqkfpjkdcblkcwywkwnspklxqqkzlqsoaocvzcmzpbyrktlsaoubvarioiyyqswkkcbfyxspdukfntcuexjrwjazjzrkzqpfzzatwpepvuozbyspsqskdtzhmsesfhqocqvnyfbvlevbvagnngyaqsaowxfaduohjzscjiwwhblllxldoilgmpgxqpqcrkqqnynxzawhtefeiclormrvvknjdgelcdpyvnbdtnhbhazhadgypymcusmvfzfretjenbcgmlqkcancefnkkfpveayjgaicqhjmotbjwotplebivfrbtudutrlrskygmwrpfknrmwdtvqqkaiongccfuhsrsabpyetuzjoihmjlvoxccquawewdnxqzrzuzlrwsuugnefzdckqblsfnyqkdpqoichtwiqsatclgxeyeyiaussbvjczeqklzrhfwnmzypuffozbnavbqndshbqidomdedycflwuzsfbxxdkylhivrkomaslkvlrahulbvowhcdtzrypdewgrvysefwnpvavmtahaeecdrwhtuwqvngpdvscikkdltdfeuvalmznmpidkmgzdvpukyzoybczpwxaitqwwkrvuzzzatdvarxgapcnbvnkbhpeoeogjkxmbxistqtzydghilwqewmwrqvscnptgjyvafbwpekdmpancbnihsznophhphpvghyngzwdwbrzllnqipmciqrahzifbzqjswrnexmsmnycldoasytdwcyaqhagyjdznwljgjccsqtlxnemxuzgkhxpvazjczpqsltpwlrhytxoqndulbqbnnriwcemtrbmpjeztbgqqqetrysngzvfykekqzutyrobhsfekzpkiwbhnowmxzsdyvfevizxdsxmthymxlwjfbxepssbcumfhkddidhcdtsgqmwxmqdccwaynhxtjvlrmwpshzvedemzstuhnzjwpnjkimrokdmngcimatazxbvvmuzxcrjusvwevmnkwypfkgumfnitwhomdmzlgkhtnuzogvxxjkppfkiakyeirsstnqchjjqroxhuvgfccjaxynbhgdejhsfeoonhdapvbsprwjdnzcwoorsjbfzbkelfjmomadjepxeaidrrnuhwufzvajqzkwmhpeevyubdwzgzeljqahxyestnjhelkeagrujjolllqynlnpuhulcxgmgqnikqmgyhxuqeoyxogplmuepxrsnblyklxkpodpggbrxcliomptabppkigjfbzbxqrkfdhaviluyehazvphbmhtimbvksriddghasqsaqimgufbfhlbxaxhwqjqjkffhwlmfemuglaivutpsxalxebokoymvxjfezfmyzlpmcnyxhpqgtzffuyzmfjosgzzhphryrzcsblywwovjiuoqybhjpnbxwivzijlctbkkuhucuahysaszvrjkoxebbwtjxqjvkdzsbiqgsomcycyikkvwsdnzpiojmpqflbvdhpdzgdzxowfrjmmbautrlzqwbxyztdenciqaenxigcnciuskvlwjhklvsblijqxvxmqxptxwtlzcpinciymmlemedivuaadgcpwiihzksrnzyrkuaepmnzhphvkezsdaouzxkkubocudfasmhkwkcpthyglzaggmftkvccxqnehnzptnvqcgkgllndglyzvenkgkbnxjjgiwowyvpfstrelvyvtycuoumpdbokzmlpsxqmqukfkkoohuwnpfpfuriutuhhvhtcwfqaphdzhsfmivixwilolzgpsctquabrxfdcsvbfokyauqvnwvnbgbiamqczwxoocjqopjmgysgrvnatzihvlzfaxhksleenuptuvjpyxnvgvocftmjrczmobsvcmdwcovqhddkyjecywsyxhranlmeteondsfhudbccttkcfbmmdndrgbwdyexaxkioleuvdgpvzksniqtulqtjefaagsjtnftuzqfcrxibsoiwcltoznvqdtljnzeasddrvbohpbrfqflsfpplnwdyshupfazcigrogjkycxvilgrnvrnrmdbkqsyfmptztmbfzsmbphbxpaaxutpaxguwcsangqtvjaezdqzbdxemqclzxosdyzwipbqqvjjjkubtnmuvjqtjbvvgvdfelkuapfkmvedoeqaeklkxztcpvqwzkesdsowmxezxgqreptwxatppquiihwqevrgzqkpmydkgtflqqkwpcpxbvhwttjerblcjlvhkhbbswpepxgfvibnxteeblvsjivvjtweakgizadbyxrxqdlpccdghrgtprjpecoujmnnkbjnbocqhgzwnhgizwadywkwmqgfxbidtnpdmjxjqvoaqzarwitfnriegluektijojdbctzvruonkxfsvqurbnmxqjrvypyzmhnktphzkbisflkwgtidwphczfqujqgtnjrmdqyzedlcosstncsinkrcgqzlacofxoelusifadhwvzgvpqodkurpfqnsjjigvwqydqgzmtdisoucywzjprhbkxfdnqxswdlensqimtzdilyvhxrmiqkybmrztamlprgpyvtgxvrivklsyjbzurvsxhgrvoaglllzkeitbnazicmotjdpfejyjyuhgnjiysrbjwrnttylgngouehapfeknbnovoaroqehpuietjdahpsghmzweyueawmbgoqplnjopzpikodejnjsvglbxcloggnlpygdteorwyuttnaajmxwbtvlndzhtxsjorcsuqkzaxpzbyazeknyqioovkahjcufwxqkuqxoiihckkbdutsokbndiwcpnhcuuvibmelczjgkzcltciefrcvxxdljtlaipcpjedqfzznxgfnxvebmslqyhkedsmwarwbzxfyxglwoawhwzndcmvtgvbhcykbbnyqblzzvypgcxbnjljisyivblpehtdjpdbyfrvndphswtrrvaxltmkdwtsrdlyjtxjtamykgoorpjcworkrgdiqnqclkyxrajbcuyzmaewmdhfvekeszafcjjutvxvuitjxdvwrxihloogzbzpwucfvygsrafkhrsczweoszfckiprqoceoopphbblvtugsglszzifqgzyglsrlfrbffgezblbqycifzbrvwzkdxkikxdhosveoeumvixlbxruesfduqbrvtzfxyviqedeuztmlxqshbfumnvjuiqlgepeftjraydcmlkjidzijvsvtdhdepdqaazugvkegykkdnnakutkslayrczqlpbzzbmeczbstvyifrihpgncevvbexptthiixubmplucewdyrvnvzthvknfjcuovvssmrtdhqxdsdnrvkjqwjktytkkztkeqapebeszgscidedoawvszeipqjasoqhzqqysesfnfnyzzuipocvwtdusbxzqiczahgkdjyqdcvrziylpkadymhbgmlsyhdidfhbqumrvutpdlchmdoylmygadtrbjseornadyjtrqknmhbvceyjehqakyyoamiyseqomwdrkvqrtmttqjtmexlzusqyulgtiunqnlhqtplheabteosujidxxkamlzolsffbewwklweyxupnjpuufrbaydjvrcrahuxhtumfqvolilnpsxxxssjsijjejdbdpsqsnowkaidznxmmgbehnmpdbnxwgvunzsqibqzzliuqzjlcqtttrtnrtvzdekhcfykmxbyjmubwfexojuuizhiknzwatevufctndsfbmcrtvmgojcoukkmhwuocjebipcwhklrqfutdzbadhflyuidtysvlvunuoabjddzouydhaseehzzxnsutsrczlusvrhvmtbybgudfvmbuvvxwsnkzcdioquywqqnpwmyvdzaepaqopwcdhizcrfojmbhsuhphvsxzthfoyybvivctrbfwlejsgfudhtharhpmooqcimcjvfeweteflsjllunslsqwzwnyzvikptwhfokvejqedszxpjzkpdecrdjqhcdcgwuhmcsiofknertrqpvhdcymmhtgteuoidsyqqcdfznprbcleaovbupvnvpyegegmgnyijglmzotpvedhwygczjrdqhtwjgjycdksxzvitgpkdyvurkbbmqogdisyhceltyowkcnbtewzczhiiihnhlubuasjbslwlkzlfixvlzvgxbsdmzvcasewsjhrmhkiqjgkwdbdmxxpdfpvpcsznkqapefklcppvlhzpwvciepggpftdajkusmkomgkeosylwepfypclnulcqoubhnrucbaapwdblcbbdwhorgxpfljrkweswqljcphwxcbrvsbqanqjgcsjkabfevnjokxzvyohazzcqhirwbnxegoubenktsgnvdsygsivriwmkvcphphhbdhiadmewonkvptgtdjeafjowwvybjkammvbazxbmdubztcktotpvdgzujeyoeblrmzhadepgxnklqonwfnpczndhpprodqagbxljbfnjpwqurogieqjgtodnwnzkzynnohcydwygliizlkmabffqcklayndeudmwdgdowebzdpqsravzrxtjbzuaoljviiknztqdbhcgofgmpibtquzovktjvuolutmvabspuqtxuahkcviizpzzpuzgvvcljohmaiksvjoepeidsuqbnkofldpzmgtgewgobwhuqsspqfouxbofydiqtbidiuidymqcqfsqcbqgrodapfjdxihxazhlumqxksbfudfrzrnfdpawlgmfsacotpirhyspfwwtzopshzzgqwsntkvmkwqsbeesrngtlnhptfzgvpdmdpjrfuiocsfvatjxaytheqnjwxykfgbqjpprpstdahgfnktsmhccazlexpovdahkrvykgcldzcsjzrbvrxgirajrgdljufvukdxxzvcgaqlgylvrnogfkaxdcgpiqjcadqfczbblczcmbgnfafojsjrqqlerqgikgbvyuhtrmkmnzikuylbfzctvtfaqjblzgyurucyisgozufifszolzfrlqaxoiotvobesmofdmhghumhvlxeajuwsygjxdlkerzrivbjgnydbhacidbbthrxaanvjlleplbojoltqjdzdwqgzeobmokzccmefbzdmjscyfmddwyasrrfhfkuynyetftmkkonwjoagikbzctenxnaxonnsulmtghurpfwwzcshdcwccsufobeywqutamlckxiwmxzhztszmuxngecbsqhdkylkfjuxdonhgyugiybftbaijxnscjxqxxiysjtciwlaqpexsbxltyrvenvhsswxarkicjlhsebpwvdniumbxflzvlunvmxddxkivmfmlhnjzmffnktcxydymiuztopdhvvzxhqzbfmvybjdalrlaiuftpdgrgytdingnvkfhiegetknufwjfjrvpkhrdhghvztagwnqmqryqcioffmincnjqvihiqudykuxvccrpwyaakkpswxjabqmhkceynthxxhwwoojpbziannhseubeqgqrgystyyfkjbsumdnjyyltisadxqe")).isEqualTo(290947);
    }
}