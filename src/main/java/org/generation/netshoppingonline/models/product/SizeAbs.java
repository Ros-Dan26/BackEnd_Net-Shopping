/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.product;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 *
 * @author JesusFloresTemahuay
 */
@MappedSuperclass
public abstract class SizeAbs {

    public static final String T060 = "06.0";
    public static final String T065 = "06.5";
    public static final String T070 = "07.0";
    public static final String T075 = "07.5";
    public static final String T080 = "08.0";
    public static final String T085 = "08.5";
    public static final String T090 = "09.0";
    public static final String T095 = "09.5";
    public static final String T100 = "10.0";
    public static final String T105 = "10.5";
    public static final String T110 = "11.0";
    public static final String T115 = "11.5";
    public static final String T120 = "12.0";
    public static final String T125 = "12.5";
    public static final String T130 = "13.0";
    public static final String T135 = "13.5";
    public static final String T140 = "14.0";
    public static final String T145 = "14.5";
    public static final String T150 = "15.0";
    public static final String T155 = "15.5";
    public static final String T160 = "16.0";
    public static final String T165 = "16.5";
    public static final String T170 = "17.0";
    public static final String T175 = "17.5";
    public static final String T180 = "18.0";
    public static final String T185 = "18.5";
    public static final String T190 = "19.0";
    public static final String T195 = "19.5";
    public static final String T200 = "20.0";
    public static final String T205 = "20.5";
    public static final String T210 = "21.0";
    public static final String T215 = "21.5";
    public static final String T220 = "22.0";
    public static final String T225 = "22.5";
    public static final String T230 = "23.0";
    public static final String T235 = "23.5";
    public static final String T240 = "24.0";
    public static final String T245 = "24.5";
    public static final String T250 = "25.0";
    public static final String T255 = "25.5";
    public static final String T260 = "26.0";
    public static final String T265 = "26.5";
    public static final String T270 = "27.0";
    public static final String T275 = "27.5";
    public static final String T280 = "28.0";
    public static final String T285 = "28.5";
    public static final String T290 = "29.0";
    public static final String T295 = "29.5";
    public static final String T300 = "30.0";
    public static final String T305 = "30.5";
    public static final String T310 = "31.0";
    public static final String T315 = "31.5";
    public static final String T320 = "32.0";
    public static final String T325 = "32.5";
    public static final String T330 = "33.0";

    public static final String SIZES[] = {
        T060,
        T065,
        T070,
        T075,
        T080,
        T085,
        T090,
        T095,
        T100,
        T105,
        T110,
        T115,
        T120,
        T125,
        T130,
        T135,
        T140,
        T145,
        T150,
        T155,
        T160,
        T165,
        T170,
        T175,
        T180,
        T185,
        T190,
        T195,
        T200,
        T205,
        T210,
        T215,
        T220,
        T225,
        T230,
        T235,
        T240,
        T245,
        T250,
        T255,
        T260,
        T265,
        T270,
        T275,
        T280,
        T285,
        T290,
        T295,
        T300,
        T305,
        T310,
        T315,
        T320,
        T325,
        T330
    };

    @Id
    protected int id;
    @Column(name = "_06_0")
    protected int t060;
    @Column(name = "_06_5")
    protected int t065;
    @Column(name = "_07_0")
    protected int t070;
    @Column(name = "_07_5")
    protected int t075;
    @Column(name = "_08_0")
    protected int t080;
    @Column(name = "_08_5")
    protected int t085;
    @Column(name = "_09_0")
    protected int t090;
    @Column(name = "_09_5")
    protected int t095;
    @Column(name = "_10_0")
    protected int t100;
    @Column(name = "_10_5")
    protected int t105;
    @Column(name = "_11_0")
    protected int t110;
    @Column(name = "_11_5")
    protected int t115;
    @Column(name = "_12_0")
    protected int t120;
    @Column(name = "_12_5")
    protected int t125;
    @Column(name = "_13_0")
    protected int t130;
    @Column(name = "_13_5")
    protected int t135;
    @Column(name = "_14_0")
    protected int t140;
    @Column(name = "_14_5")
    protected int t145;
    @Column(name = "_15_0")
    protected int t150;
    @Column(name = "_15_5")
    protected int t155;
    @Column(name = "_16_0")
    protected int t160;
    @Column(name = "_16_5")
    protected int t165;
    @Column(name = "_17_0")
    protected int t170;
    @Column(name = "_17_5")
    protected int t175;
    @Column(name = "_18_0")
    protected int t180;
    @Column(name = "_18_5")
    protected int t185;
    @Column(name = "_19_0")
    protected int t190;
    @Column(name = "_19_5")
    protected int t195;
    @Column(name = "_20_0")
    protected int t200;
    @Column(name = "_20_5")
    protected int t205;
    @Column(name = "_21_0")
    protected int t210;
    @Column(name = "_21_5")
    protected int t215;
    @Column(name = "_22_0")
    protected int t220;
    @Column(name = "_22_5")
    protected int t225;
    @Column(name = "_23_0")
    protected int t230;
    @Column(name = "_23_5")
    protected int t235;
    @Column(name = "_24_0")
    protected int t240;
    @Column(name = "_24_5")
    protected int t245;
    @Column(name = "_25_0")
    protected int t250;
    @Column(name = "_25_5")
    protected int t255;
    @Column(name = "_26_0")
    protected int t260;
    @Column(name = "_26_5")
    protected int t265;
    @Column(name = "_27_0")
    protected int t270;
    @Column(name = "_27_5")
    protected int t275;
    @Column(name = "_28_0")
    protected int t280;
    @Column(name = "_28_5")
    protected int t285;
    @Column(name = "_29_0")
    protected int t290;
    @Column(name = "_29_5")
    protected int t295;
    @Column(name = "_30_0")
    protected int t300;
    @Column(name = "_30_5")
    protected int t305;
    @Column(name = "_31_0")
    protected int t310;
    @Column(name = "_31_5")
    protected int t315;
    @Column(name = "_32_0")
    protected int t320;
    @Column(name = "_32_5")
    protected int t325;
    @Column(name = "_33_0")
    protected int t330;

    public SizeAbs() {
    }

    public SizeAbs(
            int id,
            int t060,
            int t065,
            int t070,
            int t075,
            int t080,
            int t085,
            int t090,
            int t095,
            int t100,
            int t105,
            int t110,
            int t115,
            int t120,
            int t125,
            int t130,
            int t135,
            int t140,
            int t145,
            int t150,
            int t155,
            int t160,
            int t165,
            int t170,
            int t175,
            int t180,
            int t185,
            int t190,
            int t195,
            int t200,
            int t205,
            int t210,
            int t215,
            int t220,
            int t225,
            int t230,
            int t235,
            int t240,
            int t245,
            int t250,
            int t255,
            int t260,
            int t265,
            int t270,
            int t275,
            int t280,
            int t285,
            int t290,
            int t295,
            int t300,
            int t305,
            int t310,
            int t315,
            int t320,
            int t325,
            int t330) {
        this.id = id;
        this.t060 = t060;
        this.t065 = t065;
        this.t070 = t070;
        this.t075 = t075;
        this.t080 = t080;
        this.t085 = t085;
        this.t090 = t090;
        this.t095 = t095;
        this.t100 = t100;
        this.t105 = t105;
        this.t110 = t110;
        this.t115 = t115;
        this.t120 = t120;
        this.t125 = t125;
        this.t130 = t130;
        this.t135 = t135;
        this.t140 = t140;
        this.t145 = t145;
        this.t150 = t150;
        this.t155 = t155;
        this.t160 = t160;
        this.t165 = t165;
        this.t170 = t170;
        this.t175 = t175;
        this.t180 = t180;
        this.t185 = t185;
        this.t190 = t190;
        this.t195 = t195;
        this.t200 = t200;
        this.t205 = t205;
        this.t210 = t210;
        this.t215 = t215;
        this.t220 = t220;
        this.t225 = t225;
        this.t230 = t230;
        this.t235 = t235;
        this.t240 = t240;
        this.t245 = t245;
        this.t250 = t250;
        this.t255 = t255;
        this.t260 = t260;
        this.t265 = t265;
        this.t270 = t270;
        this.t275 = t275;
        this.t280 = t280;
        this.t285 = t285;
        this.t290 = t290;
        this.t295 = t295;
        this.t300 = t300;
        this.t305 = t305;
        this.t310 = t310;
        this.t315 = t315;
        this.t320 = t320;
        this.t325 = t325;
        this.t330 = t330;
    }

    public int getId() {
        return id;
    }

    public int getT060() {
        return t060;
    }

    public void setT060(int t060) {
        this.t060 = t060;
    }

    public int getT065() {
        return t065;
    }

    public void setT065(int t065) {
        this.t065 = t065;
    }

    public int getT070() {
        return t070;
    }

    public void setT070(int t070) {
        this.t070 = t070;
    }

    public int getT075() {
        return t075;
    }

    public void setT075(int t075) {
        this.t075 = t075;
    }

    public int getT080() {
        return t080;
    }

    public void setT080(int t080) {
        this.t080 = t080;
    }

    public int getT085() {
        return t085;
    }

    public void setT085(int t085) {
        this.t085 = t085;
    }

    public int getT090() {
        return t090;
    }

    public void setT090(int t090) {
        this.t090 = t090;
    }

    public int getT095() {
        return t095;
    }

    public void setT095(int t095) {
        this.t095 = t095;
    }

    public int getT100() {
        return t100;
    }

    public void setT100(int t100) {
        this.t100 = t100;
    }

    public int getT105() {
        return t105;
    }

    public void setT105(int t105) {
        this.t105 = t105;
    }

    public int getT110() {
        return t110;
    }

    public void setT110(int t110) {
        this.t110 = t110;
    }

    public int getT115() {
        return t115;
    }

    public void setT115(int t115) {
        this.t115 = t115;
    }

    public int getT120() {
        return t120;
    }

    public void setT120(int t120) {
        this.t120 = t120;
    }

    public int getT125() {
        return t125;
    }

    public void setT125(int t125) {
        this.t125 = t125;
    }

    public int getT130() {
        return t130;
    }

    public void setT130(int t130) {
        this.t130 = t130;
    }

    public int getT135() {
        return t135;
    }

    public void setT135(int t135) {
        this.t135 = t135;
    }

    public int getT140() {
        return t140;
    }

    public void setT140(int t140) {
        this.t140 = t140;
    }

    public int getT145() {
        return t145;
    }

    public void setT145(int t145) {
        this.t145 = t145;
    }

    public int getT150() {
        return t150;
    }

    public void setT150(int t150) {
        this.t150 = t150;
    }

    public int getT155() {
        return t155;
    }

    public void setT155(int t155) {
        this.t155 = t155;
    }

    public int getT160() {
        return t160;
    }

    public void setT160(int t160) {
        this.t160 = t160;
    }

    public int getT165() {
        return t165;
    }

    public void setT165(int t165) {
        this.t165 = t165;
    }

    public int getT170() {
        return t170;
    }

    public void setT170(int t170) {
        this.t170 = t170;
    }

    public int getT175() {
        return t175;
    }

    public void setT175(int t175) {
        this.t175 = t175;
    }

    public int getT180() {
        return t180;
    }

    public void setT180(int t180) {
        this.t180 = t180;
    }

    public int getT185() {
        return t185;
    }

    public void setT185(int t185) {
        this.t185 = t185;
    }

    public int getT190() {
        return t190;
    }

    public void setT190(int t190) {
        this.t190 = t190;
    }

    public int getT195() {
        return t195;
    }

    public void setT195(int t195) {
        this.t195 = t195;
    }

    public int getT200() {
        return t200;
    }

    public void setT200(int t200) {
        this.t200 = t200;
    }

    public int getT205() {
        return t205;
    }

    public void setT205(int t205) {
        this.t205 = t205;
    }

    public int getT210() {
        return t210;
    }

    public void setT210(int t210) {
        this.t210 = t210;
    }

    public int getT215() {
        return t215;
    }

    public void setT215(int t215) {
        this.t215 = t215;
    }

    public int getT220() {
        return t220;
    }

    public void setT220(int t220) {
        this.t220 = t220;
    }

    public int getT225() {
        return t225;
    }

    public void setT225(int t225) {
        this.t225 = t225;
    }

    public int getT230() {
        return t230;
    }

    public void setT230(int t230) {
        this.t230 = t230;
    }

    public int getT235() {
        return t235;
    }

    public void setT235(int t235) {
        this.t235 = t235;
    }

    public int getT240() {
        return t240;
    }

    public void setT240(int t240) {
        this.t240 = t240;
    }

    public int getT245() {
        return t245;
    }

    public void setT245(int t245) {
        this.t245 = t245;
    }

    public int getT250() {
        return t250;
    }

    public void setT250(int t250) {
        this.t250 = t250;
    }

    public int getT255() {
        return t255;
    }

    public void setT255(int t255) {
        this.t255 = t255;
    }

    public int getT260() {
        return t260;
    }

    public void setT260(int t260) {
        this.t260 = t260;
    }

    public int getT265() {
        return t265;
    }

    public void setT265(int t265) {
        this.t265 = t265;
    }

    public int getT270() {
        return t270;
    }

    public void setT270(int t270) {
        this.t270 = t270;
    }

    public int getT275() {
        return t275;
    }

    public void setT275(int t275) {
        this.t275 = t275;
    }

    public int getT280() {
        return t280;
    }

    public void setT280(int t280) {
        this.t280 = t280;
    }

    public int getT285() {
        return t285;
    }

    public void setT285(int t285) {
        this.t285 = t285;
    }

    public int getT290() {
        return t290;
    }

    public void setT290(int t290) {
        this.t290 = t290;
    }

    public int getT295() {
        return t295;
    }

    public void setT295(int t295) {
        this.t295 = t295;
    }

    public int getT300() {
        return t300;
    }

    public void setT300(int t300) {
        this.t300 = t300;
    }

    public int getT305() {
        return t305;
    }

    public void setT305(int t305) {
        this.t305 = t305;
    }

    public int getT310() {
        return t310;
    }

    public void setT310(int t310) {
        this.t310 = t310;
    }

    public int getT315() {
        return t315;
    }

    public void setT315(int t315) {
        this.t315 = t315;
    }

    public int getT320() {
        return t320;
    }

    public void setT320(int t320) {
        this.t320 = t320;
    }

    public int getT325() {
        return t325;
    }

    public void setT325(int t325) {
        this.t325 = t325;
    }

    public int getT330() {
        return t330;
    }

    public void setT330(int t330) {
        this.t330 = t330;
    }

    public int getSize(String size) {
        switch (size) {
            case T060:
                return getT060();
            case T065:
                return getT065();
            case T070:
                return getT070();
            case T075:
                return getT075();
            case T080:
                return getT080();
            case T085:
                return getT085();
            case T090:
                return getT090();
            case T095:
                return getT095();
            case T100:
                return getT100();
            case T105:
                return getT105();
            case T110:
                return getT110();
            case T115:
                return getT115();
            case T120:
                return getT120();
            case T125:
                return getT125();
            case T130:
                return getT130();
            case T135:
                return getT135();
            case T140:
                return getT140();
            case T145:
                return getT145();
            case T150:
                return getT150();
            case T155:
                return getT155();
            case T160:
                return getT160();
            case T165:
                return getT165();
            case T170:
                return getT170();
            case T175:
                return getT175();
            case T180:
                return getT180();
            case T185:
                return getT185();
            case T190:
                return getT190();
            case T195:
                return getT195();
            case T200:
                return getT200();
            case T205:
                return getT205();
            case T210:
                return getT210();
            case T215:
                return getT215();
            case T220:
                return getT220();
            case T225:
                return getT225();
            case T230:
                return getT230();
            case T235:
                return getT235();
            case T240:
                return getT240();
            case T245:
                return getT245();
            case T250:
                return getT250();
            case T255:
                return getT255();
            case T260:
                return getT260();
            case T265:
                return getT265();
            case T270:
                return getT270();
            case T275:
                return getT275();
            case T280:
                return getT280();
            case T285:
                return getT285();
            case T290:
                return getT290();
            case T295:
                return getT295();
            case T300:
                return getT300();
            case T305:
                return getT305();
            case T310:
                return getT310();
            case T315:
                return getT315();
            case T320:
                return getT320();
            case T325:
                return getT325();
            case T330:
                return getT330();

        }
        return -1;
    }

    public void setT330(String size, int value) {
        switch (size) {
            case T060:
                setT060(value);
                break;
            case T065:
                setT065(value);
                break;
            case T070:
                setT070(value);
                break;
            case T075:
                setT075(value);
                break;
            case T080:
                setT080(value);
                break;
            case T085:
                setT085(value);
                break;
            case T090:
                setT090(value);
                break;
            case T095:
                setT095(value);
                break;
            case T100:
                setT100(value);
                break;
            case T105:
                setT105(value);
                break;
            case T110:
                setT110(value);
                break;
            case T115:
                setT115(value);
                break;
            case T120:
                setT120(value);
                break;
            case T125:
                setT125(value);
                break;
            case T130:
                setT130(value);
                break;
            case T135:
                setT135(value);
                break;
            case T140:
                setT140(value);
                break;
            case T145:
                setT145(value);
                break;
            case T150:
                setT150(value);
                break;
            case T155:
                setT155(value);
                break;
            case T160:
                setT160(value);
                break;
            case T165:
                setT165(value);
                break;
            case T170:
                setT170(value);
                break;
            case T175:
                setT175(value);
                break;
            case T180:
                setT180(value);
                break;
            case T185:
                setT185(value);
                break;
            case T190:
                setT190(value);
                break;
            case T195:
                setT195(value);
                break;
            case T200:
                setT200(value);
                break;
            case T205:
                setT205(value);
                break;
            case T210:
                setT210(value);
                break;
            case T215:
                setT215(value);
                break;
            case T220:
                setT220(value);
                break;
            case T225:
                setT225(value);
                break;
            case T230:
                setT230(value);
                break;
            case T235:
                setT235(value);
                break;
            case T240:
                setT240(value);
                break;
            case T245:
                setT245(value);
                break;
            case T250:
                setT250(value);
                break;
            case T255:
                setT255(value);
                break;
            case T260:
                setT260(value);
                break;
            case T265:
                setT265(value);
                break;
            case T270:
                setT270(value);
                break;
            case T275:
                setT275(value);
                break;
            case T280:
                setT280(value);
                break;
            case T285:
                setT285(value);
                break;
            case T290:
                setT290(value);
                break;
            case T295:
                setT295(value);
                break;
            case T300:
                setT300(value);
                break;
            case T305:
                setT305(value);
                break;
            case T310:
                setT310(value);
                break;
            case T315:
                setT315(value);
                break;
            case T320:
                setT320(value);
                break;
            case T325:
                setT325(value);
                break;
            case T330:
                setT330(value);
                break;
        }
    }

    @Override
    public String toString() {
        return "Size{" + "id=" + id
                + ", t060=" + t060
                + ", t065=" + t065
                + ", t070=" + t070
                + ", t075=" + t075
                + ", t080=" + t080
                + ", t085=" + t085
                + ", t090=" + t090
                + ", t095=" + t095
                + ", t100=" + t100
                + ", t105=" + t105
                + ", t110=" + t110
                + ", t115=" + t115
                + ", t120=" + t120
                + ", t125=" + t125
                + ", t130=" + t130
                + ", t135=" + t135
                + ", t140=" + t140
                + ", t145=" + t145
                + ", t150=" + t150
                + ", t155=" + t155
                + ", t160=" + t160
                + ", t165=" + t165
                + ", t170=" + t170
                + ", t175=" + t175
                + ", t180=" + t180
                + ", t185=" + t185
                + ", t190=" + t190
                + ", t195=" + t195
                + ", t200=" + t200
                + ", t205=" + t205
                + ", t210=" + t210
                + ", t215=" + t215
                + ", t220=" + t220
                + ", t225=" + t225
                + ", t230=" + t230
                + ", t235=" + t235
                + ", t240=" + t240
                + ", t245=" + t245
                + ", t250=" + t250
                + ", t255=" + t255
                + ", t260=" + t260
                + ", t265=" + t265
                + ", t270=" + t270
                + ", t275=" + t275
                + ", t280=" + t280
                + ", t285=" + t285
                + ", t290=" + t290
                + ", t295=" + t295
                + ", t300=" + t300
                + ", t305=" + t305
                + ", t310=" + t310
                + ", t315=" + t315
                + ", t320=" + t320
                + ", t325=" + t325
                + ", t330=" + t330 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        hash = 59 * hash + this.t060;
        hash = 59 * hash + this.t065;
        hash = 59 * hash + this.t070;
        hash = 59 * hash + this.t075;
        hash = 59 * hash + this.t080;
        hash = 59 * hash + this.t085;
        hash = 59 * hash + this.t090;
        hash = 59 * hash + this.t095;
        hash = 59 * hash + this.t100;
        hash = 59 * hash + this.t105;
        hash = 59 * hash + this.t110;
        hash = 59 * hash + this.t115;
        hash = 59 * hash + this.t120;
        hash = 59 * hash + this.t125;
        hash = 59 * hash + this.t130;
        hash = 59 * hash + this.t135;
        hash = 59 * hash + this.t140;
        hash = 59 * hash + this.t145;
        hash = 59 * hash + this.t150;
        hash = 59 * hash + this.t155;
        hash = 59 * hash + this.t160;
        hash = 59 * hash + this.t165;
        hash = 59 * hash + this.t170;
        hash = 59 * hash + this.t175;
        hash = 59 * hash + this.t180;
        hash = 59 * hash + this.t185;
        hash = 59 * hash + this.t190;
        hash = 59 * hash + this.t195;
        hash = 59 * hash + this.t200;
        hash = 59 * hash + this.t205;
        hash = 59 * hash + this.t210;
        hash = 59 * hash + this.t215;
        hash = 59 * hash + this.t220;
        hash = 59 * hash + this.t225;
        hash = 59 * hash + this.t230;
        hash = 59 * hash + this.t235;
        hash = 59 * hash + this.t240;
        hash = 59 * hash + this.t245;
        hash = 59 * hash + this.t250;
        hash = 59 * hash + this.t255;
        hash = 59 * hash + this.t260;
        hash = 59 * hash + this.t265;
        hash = 59 * hash + this.t270;
        hash = 59 * hash + this.t275;
        hash = 59 * hash + this.t280;
        hash = 59 * hash + this.t285;
        hash = 59 * hash + this.t290;
        hash = 59 * hash + this.t295;
        hash = 59 * hash + this.t300;
        hash = 59 * hash + this.t305;
        hash = 59 * hash + this.t310;
        hash = 59 * hash + this.t315;
        hash = 59 * hash + this.t320;
        hash = 59 * hash + this.t325;
        hash = 59 * hash + this.t330;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SizeAbs other = (SizeAbs) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.t060 != other.t060) {
            return false;
        }
        if (this.t065 != other.t065) {
            return false;
        }
        if (this.t070 != other.t070) {
            return false;
        }
        if (this.t075 != other.t075) {
            return false;
        }
        if (this.t080 != other.t080) {
            return false;
        }
        if (this.t085 != other.t085) {
            return false;
        }
        if (this.t090 != other.t090) {
            return false;
        }
        if (this.t095 != other.t095) {
            return false;
        }
        if (this.t100 != other.t100) {
            return false;
        }
        if (this.t105 != other.t105) {
            return false;
        }
        if (this.t110 != other.t110) {
            return false;
        }
        if (this.t115 != other.t115) {
            return false;
        }
        if (this.t120 != other.t120) {
            return false;
        }
        if (this.t125 != other.t125) {
            return false;
        }
        if (this.t130 != other.t130) {
            return false;
        }
        if (this.t135 != other.t135) {
            return false;
        }
        if (this.t140 != other.t140) {
            return false;
        }
        if (this.t145 != other.t145) {
            return false;
        }
        if (this.t150 != other.t150) {
            return false;
        }
        if (this.t155 != other.t155) {
            return false;
        }
        if (this.t160 != other.t160) {
            return false;
        }
        if (this.t165 != other.t165) {
            return false;
        }
        if (this.t170 != other.t170) {
            return false;
        }
        if (this.t175 != other.t175) {
            return false;
        }
        if (this.t180 != other.t180) {
            return false;
        }
        if (this.t185 != other.t185) {
            return false;
        }
        if (this.t190 != other.t190) {
            return false;
        }
        if (this.t195 != other.t195) {
            return false;
        }
        if (this.t200 != other.t200) {
            return false;
        }
        if (this.t205 != other.t205) {
            return false;
        }
        if (this.t210 != other.t210) {
            return false;
        }
        if (this.t215 != other.t215) {
            return false;
        }
        if (this.t220 != other.t220) {
            return false;
        }
        if (this.t225 != other.t225) {
            return false;
        }
        if (this.t230 != other.t230) {
            return false;
        }
        if (this.t235 != other.t235) {
            return false;
        }
        if (this.t240 != other.t240) {
            return false;
        }
        if (this.t245 != other.t245) {
            return false;
        }
        if (this.t250 != other.t250) {
            return false;
        }
        if (this.t255 != other.t255) {
            return false;
        }
        if (this.t260 != other.t260) {
            return false;
        }
        if (this.t265 != other.t265) {
            return false;
        }
        if (this.t270 != other.t270) {
            return false;
        }
        if (this.t275 != other.t275) {
            return false;
        }
        if (this.t280 != other.t280) {
            return false;
        }
        if (this.t285 != other.t285) {
            return false;
        }
        if (this.t290 != other.t290) {
            return false;
        }
        if (this.t295 != other.t295) {
            return false;
        }
        if (this.t300 != other.t300) {
            return false;
        }
        if (this.t305 != other.t305) {
            return false;
        }
        if (this.t310 != other.t310) {
            return false;
        }
        if (this.t315 != other.t315) {
            return false;
        }
        if (this.t320 != other.t320) {
            return false;
        }
        if (this.t325 != other.t325) {
            return false;
        }
        return this.t330 == other.t330;
    }

}
