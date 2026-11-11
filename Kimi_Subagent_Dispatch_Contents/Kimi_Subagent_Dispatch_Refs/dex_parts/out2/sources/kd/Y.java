package kd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class Y {

    @NotNull
    public static final X Companion = new X();
    public static final Y p = new Y();
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final Integer o;

    public Y() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return Intrinsics.b(this.a, y.a) && Intrinsics.b(this.b, y.b) && Intrinsics.b(this.c, y.c) && Intrinsics.b(this.d, y.d) && Intrinsics.b(this.e, y.e) && Intrinsics.b(this.f, y.f) && Intrinsics.b(this.g, y.g) && Intrinsics.b(this.h, y.h) && Intrinsics.b(this.i, y.i) && Intrinsics.b(this.j, y.j) && Intrinsics.b(this.k, y.k) && Intrinsics.b(this.l, y.l) && Intrinsics.b(this.m, y.m) && Intrinsics.b(this.n, y.n) && Intrinsics.b(this.o, y.o);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.l;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.m;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.n;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num = this.o;
        return iHashCode14 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = A8.b.l("MobileHomepageShowcaseStyleHint(_color=", this.a, ", _backgroundPicLight=", this.b, ", _backgroundPicDark=");
        sbL.append(this.c);
        sbL.append(", _useBackgroundPic=");
        sbL.append(this.d);
        sbL.append(", _prefixIconLight=");
        A8.b.x(sbL, this.e, ", _prefixIconDark=", this.f, ", _backgroundColorLight=");
        A8.b.x(sbL, this.g, ", _backgroundColorDark=", this.h, ", _fontForegroundColorLight=");
        A8.b.x(sbL, this.i, ", _fontForegroundColorDark=", this.j, ", _trailingBackgroundPicLight=");
        A8.b.x(sbL, this.k, ", _trailingBackgroundPicDark=", this.l, ", _highlightedTextColorLight=");
        A8.b.x(sbL, this.m, ", _highlightedTextColorDark=", this.n, ", _trailingSpaceInsetWidth=");
        sbL.append(this.o);
        sbL.append(")");
        return sbL.toString();
    }

    public /* synthetic */ Y(int i, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str8;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str9;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str10;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str11;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str12;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str13;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num;
        }
    }
}
