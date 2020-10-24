package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity_ar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ar);

        ArrayList<food> MainDish = new ArrayList<>();


        food foo1 = new food("مجبوس دجاج ",R.drawable.md,"دجاجتان (يجب أن يكون وزن الدجاجة ما يقارب كيلوغرام). ملعقتان كبيرتان من الزيت النباتي. ثلاثة أكواب من الأرز البسمتي. أربعة أكواب من الماء المغلي. بصلتان مفرومتان ناعماً. خمس حبات من الفلفل الأسود غير المطحون. ست حبات هيل. ثلاثة أعواد من القرفة. ملح (حسب الحاجة). ملعقة صغيرة من الزعفران. ملعقة صغيرة من البهارات المشكلة. ثلاث ملاعق كبيرة من الخل. حبتان من الليمون. خمسة دبابيس من القرنفل. كوب من الزبيب منقوع في ماءٍ ساخن. ربع كوب بقدونس مفروم خشناً. مُكسّرات محمصة (لوز، وصنوبر). شرائح من الطماطم والليمون والفليفلة الحلوة", "نغسل الدجاج جيداً من الداخل والخارج ونضعه في وعاء، ثمّ نضيف له الخل وعصير الليمون ونتركه نصف ساعة ثم نغسله جيداً بالماء. نضع الأرز في وعاء ونضيف له القليل من الملح وماء فاتر، ونتركه منقوعاً لمدة نصف ساعة ثم نغسله جيداً ونصفيه من الماء. نضع الزيت النباتي في وعاء، ونضيف له البصلة والبهارات ونتركه حتى يذبل البصل. نضيف الماء المغلي والدجاج والملح، ونغطي الوعاء ونتركه على النار لمدة ساعتين حتى ينضج الدجاج بشكل كامل. نرفع الدجاج بعد أن ينضج من الماء، ونضعه في صينية وندخله الفرن كي يأخذ اللون الذهبي. نضيف كمية مناسبة من الماء ونضع الأرز في نفس قدر الدجاج ونتركه على النار حتى يتشرّب المرق. نضيف الزعفران ونترك الأرز على نار هادئة حتى ينضج تماماً مع مراعاة تحريكه بشوكة من وقت لآخر حتى لا يحترق. نقلي البصلة المتبقية في القليل من الزيت حتى تأخذ اللون الذهبي، ثمّ نضيف كميّةً من الماء ونضع الزبيب ونتركه حتى ينفش الزبيب. بعد أن ينضج الأرز نسكبه في صحن التقديم، ونضع عليه الدجاج المحمر بالترتيب، ونزينه بالبصل والزبيب والمكسرات المحمصة والبقدونس ونقدمه مع اللبن الرائب. في حال رغبنا بالحصول على نكهة مدخنة نضع قطعةً من الفحم المشتعل في قدر الأرز، ونضع عليها بضع قطرات من الزيت النباتي، ونغطي القدر لمدة خمس دقائق قبل التقديم. يمكنك استبدال الدجاج باللحم في الطهي، بنفس الكمية والخطوات والبهارات، لكن يجب سلق اللحم في قدر والماء المغلي بالبهارات، والتخلّص من الزفرة المتكونة في أعلى القدر، ونستخدم المرق في طهي الارز.\n" +
                "\n" ,
                "https://youtu.be/cGzl2vQDHpM" , "https://jm3eia.com/");
        food foo2  = new food(" مجبوس لحم",R.drawable.ml,"كيلوغرامين من لحم الخروف، مقطّع إلى قطعٍ كبيرة. عصير ليمونة واحدة. ملح حسب الذوق. ثلاثة أعواد صغيرة من القرفة. سبع حبات من الهيل. ملعقة صغيرة من كبش القرنفل حب. ورقتان من الغار. ملعقة كبيرة من زيت الزيتون. رأس بصل كبير الحجم مقطّع إلى أربعة أجزاء متساوية. رشة فلفل أسود. ملعقة صغيرة من الكزبرة ناشفة مطحونة . ملعقة كبيرة من البهارات المشكلة. قرن فليفلة حارة خضراء. ملعقة كبيرة من ربّ البندورة. ملعقة صغيرة من ماء الورد. رشة هيل مطحون. رشة زعفران مطحون. بضع قطرات من صبغة الطعام (لون برتقالي). ثلاثة أكواب أرز بسمتي منقوع ومصفّىً. ثلاث حبات من البصل متوسّطة الحجم مفرومة فرماً ناعماً. رشة فلفل أبيض. ملعقة صغيرة لومي مطحون. زيت نباتي. كوبان من الحمص مسلوق. نصف كوب من الزبيب.\n" +
                "\n","نضع قطع اللحم في وعاء، ونعصر فوقها عصير ليمون حامض، مع رشة ملح قليلة. نحضر قدراً عميقة، ونضع فيها زيتاً نباتياً، ونرفعها عن النار، ونضيف البصل، والفليفلة الحارة، وأعواد القرفة، والهيل المطحون، وكبش القرنفل، وأوراق الغار. نضيف قطع اللحم إلى المكوّنات الموجودة في القدر، ونقلبها على نار متوسّطة حتى يبدأ لونها بالتغيّر. نضيف رشة الفلفل الأسود، والكزبرة، والبهارات المشكلة. نضيف ماء ساخن إلى المكوّنات في القدر حتى تُغمر. نترك المكونات جميعها على نار متوسطة لمدة ساعة، حتى تنضج اللحمة تماماً. ننشل قطع اللحم من المرق بعد التأكد من نضوجه ، ونصفي المرق بمصفاة سلك ونحتفظ بالمرق جانباً. نخلط ماء الورد والهيل المطحون في صحن صغير مع الزعفران، ونضيف بضع قطرات من صبغة الطعام البرتقالية. ندهن صينية معدنية بالزيت وربّ البندورة ومزيج ماء الورد والهيل والزعفران وصبغة الطعام، ونرتّب فيها قطع اللحم الناضجة. نضع الصينية في الفرن لتحمير قطع اللحم. نضع مقداراً من المرق المصفّى في قدر، وذلك بما يتناسب مع كمية الأرز، ونضع الأرز ونرفعها على النار بعد أن نضيف الفلفل الأبيض والبصل المفروم ناعماً والملح، ونتركه حتى ينشف ماؤه وينضج.. نحضر الحشوة؛ حيث نضع القليل من الزيت في مقلاة ونرفعها على النار، ونضيف البصل المفروم، ونقلّبه حتى يصبح ذهبي اللون، ثم نسكب فوقه القليل من الماء مع التحريك حتى ينضج. نضيف إلى المقلاة الحمص المسلوق، والزبيب والزيت. نضع رشة فلفل أسود ورشة لومي مطحون ورشة ملح، ونحرّك المكونات. بعد أن ينضج الأرز، وتتحمّر صينية اللحمة، نسكب الأرز في طبق التقديم، ونرتّب فوقه قطع اللحم، ونضع الحشوة على الجوانب\n" +
                "\n" ,
                "https://youtu.be/WCcc8F2_FOc" , "https://jm3eia.com/");
        food foo3 = new food("ستيك ",R.drawable.st,"أربع قطع من ستيك اللحم. ربع كوب من الزبدة. ملعقة كبيرة من زيت الزَّيتون. ملعقة صغيرة من كلٍ من: الفلفل الأسود الحَب. الزَّيت النباتي لشوي الستيك. الثوم المفروم. كمية من الحصلبان أو الروزماري. كميَّة من الزعتر الأخضر. حبَّة من البصل المفروم. ملعقة كبيرة من خردل الديجون. كوب من كريمة الطبخ. ملح وفلفل أسود -حسب الرغبة-.\n" +
                "\n","نقع قطع الستيك بخردل الديجون، زيت الزيتون، الحصلبان، الزعتر المفروم، الملح والفلفل الأسود لمدة نصف ساعة. وضع الزيت النباتي في مقلاة على نار عالية وتسخينها جيداً ثم إضافة قطع الستيك للمقلاة وتركها تقريباً لمدة 10 دقائق ثم قلبها على الجهة الأخرى. تحضير الصَّلصة: وضع مقلاة أخرى على النار وإضافة الزبدة وتسخينها ثم إضافة البصل المفروم وتقليبهم. إضافة الفلفل الأسود الحب والثوم المفروم للبصل وتقليبهم جيداً. إضافة خردل الديجون الصلصة وكوب الكريمة. وضع قطع الستيك في ورق الألمنيوم وتركها لمدة 10 دقائق ثم تقديمها مع الصلصة والخضار المشوي." ,
                "https://youtu.be/Ulp4r-abpFI" , "https://jm3eia.com/");
        food foo4 = new food("سمك",R.drawable.rf,"\n" +
                "ثلاث حباتٍ متوسطة الحجم من سمك الزبيدي. ثلاثة أكوابٍ من الأرز البسمتي. أربعة أكوابٍ من مرق السمك الساخن. بصلتان متوسطتا الحجم مفرومتان. ربع كوبٍ من ماء الورد. نصف كوبٍ من الزبيب. ملعقة كبيرة من اللومي المطحون. ملعقة صغيرة من كلٍ من: الكركم، والبهارات المشكلة. نصف ملعقة صغيرة من كلٍ من: الهيل المطحون، والملح. طحين وزيت نباتي للقلي.\n" , "غسل الأرز جيّداً، ونقعه في الماء من عشرين إلى خمسٍ وعشرين دقيقة. نقع الزعفران في ماء الورد وتركه جانباً. تنظيف السمك، وتتبيله بالكركم، والبهارات، ونصف كمية اللومي، والملح، والهيل. رش السمك بالطحين، وقليه في زيتٍ ساخنٍ حتى يصبح لونه ذهبياً. وضع أربع ملاعق كبيرة من الزيت في قدرٍ كبيرٍ، وقلي البصل فيه حتى يتحمّر جيداً. إضافة باقي اللومي، والزبيب، وتقليب المكونات حتى تذبل، وترك نصف الخليط جانباً. إضافة كوبٍ من الأرز إلى الخليط، ثمَّ وضع السمك فوقه، ثمَّ إضافة باقي كمية الأرز. إضافة مرق السمك، وترك القدر على نارٍ خفيفةٍ من ثلاثين إلى أربعين دقيقةً حتى ينضج الأرز. توزيع مزيج ماء الورد والزعفران فوق الأرز، وتغطيته مجدداً من خمس إلى عشر دقائق. سكب الأرز في طبق التقديم، ووضع السمك فوقه، وتزيينه بالبصل المحمّر والزبيب.\n" +
                "\n" ,
                "https://youtu.be/nstwW0A_xzI" , "https://jm3eia.com/");
        food foo5 = new food("مرق دجاج ",R.drawable.mad,"•\t1 كيلو دجاج، مقطعة الى 6 قطع - 1 بصل، مقطع إلى شرائح جوليان - 6 فص ثوم - قطعة زنجبيل صغيرة - عصير 3-4 حبات طماطم - ½ كوب صلصة طماطم - 1 حبة فلفل أخضر حار - 2 حبة لومي أسود، مجفف - 1 ملعقة صغيرة بهارات الدجاج - ½ ملعقة صغيرة كاري - رشة فلفل أسود ناعم - ½ كوب حمص مجروش، مغسول ومنقوع لمدة ربع ساعة - 2 حبة بطاطس كبيرة، مقطعة - 1 حبة جزر، مقطع إلى شرائح بسمك 1 سم - 2 كوب فاصوليا خضراء - 3-4 ملعقة كبيرة زيت\n" +
                "•\t\n" +
                "•\t\n", "•\tاغسلي الدجاج جيداً ثم صفيه من الماء، سخني القليل من الزيت في قدر عميق على نار عالية، أضيفي البصل وقلبيه حتى يتحول للون الذهبي. أضيفي قطع الدجاج واتركيه يطهى بالقدر دون تقليب، قليلاً على كل جهة حتى يتحمر ويجف الماء به تماماً. أضيفي البهارات وقلبي جيداً. أضيفي صلصة الطماطم واستمري بالتقليب حتى يتجانس المزيج ويتغير لون الخليط. أضيفي الحمص المجروش والفلفل الحار واللومي ثم قومي بتحريك القدر. أضيفي الطماطم المهروسة، الجزر، الماء المغلي والملح. اتركي القدر على نار متوسطة لمدة 15 دقيقة. أضيفي البطاطس والفاصوليا واتركي القدر يطهى حتى ينضج المزيج تماماً. أضيفي القليل من الماء المغلي من حين لآخر إذا احتاج الأمر. بعد تمام النضج، ارفعي القدر عن النار وقدميه ساخناً مع الأرز المشخول." ,
                "https://youtu.be/hmfM7MrY3NU" , "https://jm3eia.com/");

        MainDish.add(foo1);
        MainDish.add(foo2);
        MainDish.add(foo3);
        MainDish.add(foo4);
        MainDish.add(foo5);

        RecyclerView rev =findViewById(R.id.rec);

        rev.setHasFixedSize(true);
        RecyclerView.LayoutManager am = new LinearLayoutManager(this);
        rev.setLayoutManager(am);

        ArAdapter aa = new ArAdapter(MainDish,this);
        rev.setAdapter(aa);
    }
}