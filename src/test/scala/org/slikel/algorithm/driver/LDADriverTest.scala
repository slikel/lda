package org.slikel.algorithm.driver

import java.util

import org.slikel.algorithm.lda.TestWriter

/**
 * Created by shengqiang on 16/2/16.
 */
object LDADriverTest extends App {
  val list = new util.ArrayList[String]
  list.add("南都讯　记者刘凡　周昌和　任笑一　继推出日票后，深圳今后将设地铁ＶＩＰ头等车厢，设坐票制。昨日，《南都ＭＥＴＲＯ》创刊仪式暨２０１２年深港地铁圈高峰论坛上透露，在未来的１１号线上将增加特色服务，满足不同消费层次的乘客的不同需求，如特设行李架的车厢和买双倍票可有座位坐的ＶＩＰ车厢等。论坛上，深圳市政府副秘书长、轨道交通建设办公室主任赵鹏林透露，地铁未来的方向将分等级，满足不同层次的人的需求，提供不同层次的有针对的服务。其中包括一些档次稍微高一些的服务。“我们要让公共交通也能满足档次稍高一些的服务”。比如，尝试有座位的地铁票服务。尤其是一些远道而来的乘客，通过提供坐票服务，让乘坐地铁也能享受到非常舒适的体验。他说，这种坐票的服务有望在地铁３期上实行，将加挂２节车厢以实施花钱可买座位的服务。“我们希望轨道交通和家里开的车一样，分很多种。”赵鹏林说，比如有些地铁是“观光线”，不仅沿途的风光非常好，还能凭一张票无数次上下，如同旅游时提供的“通票服务”。再比如，设立可以放大件行李的车厢，今后通过设专门可放大件行李的座位，避免像现在放行李不太方便的现象。“未来地铁初步不仅在干线上铺设，还会在支线、城际线上去建设。”“觉得如果车费不太贵的话，还是愿意考虑的。”昨日市民黄小姐表示，尤其是从老街到机场这一段，老街站每次上下客都很多人，而如果赶上上下班高峰期，特别拥挤，要一路从老街站站到机场，４０、５０分钟还是挺吃力的，宁愿多花点钱也能稍微舒适一点。但是白领林先生则表示，自己每天上下班都要坐地铁，出双倍车资买坐票费用有点高。")
  list.add("同心县地处宁夏中部干旱带的核心区，　冬寒长，春暖迟，夏热短，秋凉早，干旱少雨，蒸发强烈，风大沙多。主要自然灾害有沙尘暴、干热风、霜冻、冰雹等，其中以干旱危害最为严重。由于生态环境的极度恶劣，导致农村经济发展缓慢，人民群众生产、生活水平低下，靠天吃饭的被动局面依然存在，同心，又是国家级老、少、边、穷县之一…")
  list.add("不满一岁的永康是个饱经病痛折磨的孩子，２０１１年７月５日出生的他，患有先天性心脏病、疝气，一出生便被遗弃。２０１２年１月８日，才５个月大的永康被发现呼吸困难，随后送往医院进行抢救治疗，病情稳定后于１月２８日出院。２０１２年２月１３号，永康在思源焦点公益基金的帮助下在医院接受手术治疗，术后仅８天，永康突发右侧腹股沟斜疝嵌顿及肠梗阻，又再次进行抢救治疗，术后进重症监护室。３月７日，几经病痛折磨的永康终于康复出院，目前他的病情已经稳定。")
  list.add("就废弃茶叶被转手事件发声明本报讯　“我们也是受害者！”昨日，有媒体报道称康师傅的废弃茶叶被转手卖给不良商家、冒充名茶流入市场，康师傅的一位联系人这样说。康师傅昨日晚间发出声明表示生产废料处理商作出了　“不良行为”，公司方面除表达严正关注的立场外，也已经配合政府有关单位进行调查。中止与生产废料厂商的合同康师傅在给本报的声明中确认，经查，与康师傅签订生产废料处理合同之厂商为吉安三石饲料商行，且系通过公开招标程序取得合同承揽资格，并签有保证透过合法渠道处理康师傅生产废料的承诺。昨日媒体报道的内容显示吉安三石饲料商行可能违反与康师傅签订之合同，即日起，康师傅已中止履行与吉安三石饲料商行的有关合同，并静待相关单位调查结果后从严追究责任。昨日，康师傅一位熟悉情况的人士告诉记者，这家商家是从去年三季度后开始给康师傅处理生产废料的，有关合同将在今年年底届满，这位联系人指康师傅和该商行之间没有参股或任何资本关系。“厂家承诺废料用来做枕头”“为了确保不会出现乱子我们在合同上跟这家商行更是明确约定，不能利用废弃茶叶做任何违法国家法律法规的事情的。”上述人士说，这家商行向他们承诺茶叶是用于做枕头等用品的，康师傅方面为了安全起见，还特意向他们索要用于做枕头等业务的单据，没有想到还是出了这样的事情。康师傅是内地最大的即饮茶饮料生产商，其市场份额近四成。据媒体昨日曝光的二手茶叶的产业链，回收商行将康师傅泡过后的废弃茶叶以低价出售给不良商家，商家将茶叶运往外地进行加工出售。每年百万斤的二手茶叶被制成名茶出口国外或卖给国内企业。据报道，泡后的茶叶先是被运往广州增城新塘永和龟山，在烘干后被运往东莞麻涌的茶厂加工，然后集中运至浙江安吉凯丰茶叶有限公司（下称凯丰茶厂）进行再次加工。作者：刘俊　")
  list.add("·奖励办法：率先提交的前１００个创意项目，经评估，可优先资助实施。·咨询电话：０１０－６７７８４７１０，０１０－６７７８４７２０。·报名方式：先下载报名表填写完整，网上直接上传项目概述，完整方案发邮箱。")
  list.add("２０１２年东风标致小桔灯乡村小学图书馆计划于６月２３日－２９日在湖北省武汉市新洲区凤凰镇郭岗小学举行，来自全国各地的７名志愿者带着东风标致５０８汽车捐赠的２０００本新书，建立起有一所“小桔灯乡村小学图书馆”。武汉市新洲区不仅是革命老区，也是全国有名的建筑之乡；这里的人大部分都外出从事建筑业，导致这里的留守儿童比例其高。郭岗小学现有学生１３６名（含教学点一处），其中住校学生９８名，全校９０％左右的学生都是留守儿童。在活动举行之前，学校图书室里摆满了陈旧的教科书，这里的学生在课外时间没有课外书可以阅读；在志愿者问学生喜欢读什么书的时候，大部分孩子的回答是“童话书”，当再问他们还喜欢什么图书的时候，孩子迷茫的眼神让我们明白由于没有接触过课外书，很多孩子不知道除了童话书以外还有什么类别的书可以阅读。为了改变这一现状，此次活动捐赠的图书涵盖了童话、中外文学、传统文学、注音版和绘画板少儿读物等；学校郭校长也承诺会在每天的晚自习时对全校学生开放阅读和借书。此次活动也得到了文化、经济各界名人的支持，包括陈丹青、邓康延、洪晃、陆琪、蒋方舟、饶雪漫、沈颢、沈南鹏、田立新、熊焰、张琼，都为乡村儿童推荐了他们认为应该阅读的图书；我们也在东风标致５０８汽车的支持下，在捐赠的２０００本书之外购买了上述人士推荐的图书，作为额外的补充捐赠给学校。在一周活动的结束时，志愿者们为孩子们安排了别开生面的表演，帮助孩子们展示一周以来通过阅读图书所编排的各类节目；留守在村里的老人成了孩子们的观众；而很多父母都在外打工的学生，则在活动后由于遗憾自己的表演没有亲人观看而神伤。对这些孩子，志愿者们拉着他们做游戏、聊天，帮助他们理解父母的难处，鼓励他们好好学习，在即将到来的暑假带着优秀的成绩单去城市和他们的父母团聚。")
  list.add("从汽车发明到现在，平均每天因事故死亡３３００人左右，相当于１０架大型客机坠毁。这些事故中，９５％的事故都与人员失误有关，只有４％的事故是纯机械故障。为此，２１世纪经济报道与广汽丰田汽车有限公司联合发起“文明驾驶”理念普及行动，邀请全国范围内的社会人士、专业机构及各高校参与，以“文明驾驶”为主题，　针对各种不文明驾驶行为，通过公益视觉设计的方式进行普罗教育。视频入围作品展示如下：一．留住童真作品名称：留住童真作者：崔艺文／广东商学院创意说明：以简单可爱的剪纸造型作为表现手法，故事简单易懂，通过天真无邪的小女孩和酒后驾车的醉鬼之间形成鲜明的对比，告诫人们不要酒后驾车。二．缘分作品名称：缘份作者：李在锦／中山大学创意说明：《缘份》讲了一个很简单的故事，两个大学生通过在线网络认识，但是并没有见过面。终于最后相约见面。不料男生撞上同样去赴约的女生却不知道这个女生就是去赴约的女生。三．幸福在文明时作品名称：幸福在文明时作者：周泽娜、周思华、陈晓曼、陈晓燕／华南农业大学创意说明：以不文明驾车，乱闯乱撞，最后导致悲惨事故发生作为开头，给观众强大的视觉冲击，通过通俗易懂的象征性游戏告诫人们：不要把生命当成儿戏，游戏可以重来，生命却已不再。文明驾驶，幸福生活。四．安全驾驶－－这是汽车系列之不要把你的汽车当成办公室作品名称：安全驾驶－－这是汽车系列之不要把你的汽车当成办公室作者：肖永鸿、罗豫、李国成／中山大学创意说明：本短片＂这是汽车＂系列广告代表在汽车安全驾驶中＂打电话＂的行为。短片通过模拟＂办公室＂情景，将这种不安全驾驶行为在情景中的体现与现实的驾驶过程结合起来，达到巧妙的移情效果。五．安全驾驶：这是汽车系列之不要把你的汽车当成餐厅作品名称：安全驾驶－－这是汽车系列之不要把你的汽车当成餐厅作者：肖永鸿、罗豫、李国成／中山大学创意说明：本短片＂这是汽车＂系列广告代表在汽车安全驾驶中＂饮食＂行为。短片通过模拟＂餐厅＂情景，将这种不安全驾驶行为在情景中的体现与现实的驾驶过程结合起来，达到巧妙的移情效果。")
  list.add("甘肃首批１６所偏远山区学校中，有１５所学校的１１９７名困难学生有望获得爱心运动鞋。截至目前已从平凉、白银、定西、临夏和兰州四地共征集到１９所贫困受捐学校。本报讯６月１３日上午，从“给孩子送双运动鞋”公益行动北京组委会传来消息称，经初步审查，由本报报送的省内首批１６所偏远山区学校中，有１５所学校的１１９７名困难学生有望获得爱心运动鞋。“给孩子送双运动鞋”公益行动由中华少年儿童慈善救助基金会、崔永元“我的长征”团队及搜狐网联合发起。自从５月２８日正式上线以来，先后得到大量网友和名人明星的大力支持和参与，不少爱心企业也为项目提供了大量支持与帮助。兰州晚报作为甘肃首选参与新闻媒体受邀加盟此次公益行动，负责省内受助学校的征集、推荐以及爱心运动鞋的发放等服务工作。从５月３１日开始，本报陆续刊发多篇报道向社会公开征集受捐的偏远山区学校，截至目前已从平凉、白银、定西、临夏和兰州四地共征集到１９所学校。６月１１日和１２日，本报将平凉、白银、临夏和兰州的１６所学校的相关资料进行了统一整理，并报送本次公益行动北京组委会进行审核。１３日上午，从公益行动北京组委会传来消息称，经初步筛选，平凉崆峒区花所乡中心小学、光明小学、寺沟小学、信河小学、段沟小学、泾界小学、胡刘小学、周柳小学、塔山小学、潘口小学，白银景泰喜泉学区喜集水小学、景泰兔窝小学，会宁县新塬乡中心小学，兰州榆中县哈岘乡哈岘小学，临夏州康乐县八松乡纳沟小学共１５所学校的１１９７名困难学生，有望得到“给孩子送双运动鞋”公益行动的爱心捐助。据组委会相关人士介绍，因为爱心运动鞋订做约需３０天，所以以上各学校的具体捐赠时间在一个月后才能确定。另外，有关省内第二批受助学校的材料正在整理当中，甘肃联络处将择日进行报送。")
  list.add("６月１９日，《２０１２年度“中国爱心城市”公益活动新闻发布会》在京举行。中华社会救助基金会理事长许嘉璐到会讲话。基金会高级顾问朱发忠，全国老龄办副主任朱勇，民政部社会救助司助理巡视员周萍，中华社会救助基金会副理事长耿志远，重庆市民政局巡视员谭明政。晋江市人大常委会主任陈健倩，以及１０余个省、市、自治区民政局领导及四十多家媒体参加了发布会。中华社会救助基金会秘书长时正新介绍本年度“中国爱心城市”公益活动将以“爱心城市宣传、孤老关爱救助项目及第二届中国爱心城市大会”为主要内容，重庆市、呼和浩特市、长沙市、太原市、蚌埠市、南昌市、汕头市、沧州市、晋江市及遵化市将会积极参加这一公益活动。中国雅虎副总编张银生和凤凰网城市频道总监赵耀分别以各自媒体优势介绍了活动的宣传方案。会上，中华社会救助基金会与“第二届中国爱心城市大会”承办方晋江市签约，许嘉璐理事长接受晋江市参与“百万孤老关爱行动”向国家重点扶贫地区捐赠的价值４００万元的款物。晋江市人大常委会主任陈健倩介绍了大会的筹备情况。")
  list.add("信息时报讯　南山奶粉５批次含强致癌物！前日深夜，广州市工商局在官网公布了近期对市面上乳制品及含乳食品的抽检结果。本次共抽取样品１２３１批次，实物质量合格１２０４批次，合格率为９７．８１％。值得注意的是，知名品牌光明奶油、南山奶粉及本土沙湾姜汁撞奶均在不合格之列，爱馨多羊奶粉更是两月三登“黑榜”。南山奶粉５批次含强致癌物本次抽检中，问题最为严重的当属南山奶粉。工商部门表示，共抽检该品牌奶粉５个批次，结果全部含有强致癌性物质黄曲霉毒素Ｍ１。问题奶粉由湖南长沙亚华乳业有限公司生产，分别是倍慧较大婴儿配方奶粉（２段）（４００ｇ／盒，２０１１－０８－２３）、金装倍慧较大婴儿配方奶粉（２段）（４００ｇ／盒，２０１１－０８－０４）、倍慧幼儿配方奶粉（３段）（９００ｇ／罐，２０１１－０８－０８）、倍慧较大婴儿配方奶粉（２段）（７００ｇ／包，２０１１－０７－０９）、金装倍慧较大婴儿配方奶粉（２段）（４００ｇ／盒，２０１１－１２－１７）。该厂一位客服人员表示，公司并没有收到广东方面通知，昨日有客户打电话来询问时，才得知上了“黑榜”。该客服还表示，每个批次产品出厂前都会抽样送到第三方质检机构检测，合格才能够上市销售，都有检测报告可以提供。如有进一步的情况，将会与记者联系。光明奶油菌落总数超标６月底，光明乳业在上海陷入“烧碱门”，光明随即回应称系因管道清洗不慎致食品级碱水渗入，并声明“确保此后生产的产品没有任何问题”。此风波还未平息，广州市工商局抽检结果显示，由上海光明奶酪黄油有限公司梵古易乳制品分公司生产的５０％减脂芝士片（２００ｇ／包，２０１２－０２－２３）及奥德华乳品（北京）有限公司生产的光明牌奶油（１２５ｇ／盒，２０１２－０４－２３）均检出菌落总数超标。目前问题产品已下架。昨日，光明回应称，工商部门检测的８４０片５０％减脂芝士片仅２片菌落总数超标。１０块黄油，有１块菌落总数超标。菌落总数超标的原因，是由于长途运输过程中挤压受损，加上销售环境的温度不稳定所致。沙湾姜汁撞奶霉菌超标作为特色小吃，沙湾姜汁撞奶在广州地区可谓无人不知。但检测结果显示，由番禺区沙湾牛奶食品有限公司生产的姜汁撞奶（１５０ｇ／盒，２０１２－０４－１０）霉菌超标。另一“广东产”品牌皇氏则有一批次风味发酵乳（原味）酵母不合格。目前问题产品已下架。沙湾牛奶负责人苏福荣昨日表示，企业偶尔犯错在所难免，应该“被允许”，“我们做了十几年了，不可能１００％没事，哪有常胜将军？”专家质疑光明回应偷换概念针对光明发布的声明，有知情专家质疑其错误解读，有偷换概念之嫌。该专家认为，按照检测流程，工商部门抽取了７２包共８００多片芝士片作为检测基数。在这个基数之上，再抽取１１包作为抽检样本，其中９包供检测，２包备份。在９包当中，有５包做微生物检测，一共进行了５次检测。按照国家标准，如有２次菌落值在１００～１０００之间，或者有一次菌落值在１０００以上，则为不合格。本次检测中，有两次超标，且一次超标严重，应属不合格。而光明的声明以合格和不合格的芝士片数量之间的巨大差异作简单解释，意图“大事化小”，属错误解读。事件处理南山将遭严惩工商部门表示，黄曲霉毒素Ｍ１具有剧毒性和强致癌性，目前问题批次产品已下架，由于南山奶粉检测结果问题严重，工商部门将采取严厉处罚措施。记者昨日在好又多客村店发现，多款涉事奶粉（非问题批次）仍在正常销售，专区售货员告诉记者，对抽检结果并不知情。而正在为１岁的儿子选购奶粉的市民陈先生则表示，“国内国外的奶粉都有问题，不知道选什么好。”“黑榜常客”或全城退市本次抽检中，由陕西红旗乳业科技有限公司生产的爱馨多婴儿配方羊奶粉１段（９００ｇ／罐，２０１２－０２－１３）检出菌落总数超标。而就在６月初，该品牌就已经被检出同样问题，到了６月底，又被检出含“夺命菌”阪崎肠杆菌。此外，“冠峰”和“皇氏”两个品牌也是近期“二次登榜”。针对这些食品安全问题的“累犯”，广州市工商局食品处负责人昨日表示，本次抽检过后，已经约谈爱馨多，并声明如果再检出问题，将采取全城退市措施，该类产品在一定时期内停止销售，以后每一批次产品如想上市，必须向工商部门提供检测合格报告。")
  val startTime = System.currentTimeMillis()

  val driver = new LDADriver
  driver.estimate(0.1, 0.1, 5, 100, 20, list, new TestWriter, true)
  println("耗时："+(System.currentTimeMillis()-startTime))
}