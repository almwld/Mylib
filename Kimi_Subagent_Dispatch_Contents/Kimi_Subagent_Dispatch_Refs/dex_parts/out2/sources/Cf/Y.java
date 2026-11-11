package Cf;

import cf.C2599j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y implements Hd.G {
    public final String a;
    public final String b;
    public final C2599j c;

    public Y(String str, String str2, C2599j c2599j) {
        Intrinsics.checkNotNullParameter(str, "uid");
        Intrinsics.checkNotNullParameter(str2, "chatId");
        Intrinsics.checkNotNullParameter(c2599j, "callback");
        this.a = str;
        this.b = str2;
        this.c = c2599j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return Intrinsics.b(this.a, y.a) && Intrinsics.b(this.b, y.b) && this.c.equals(y.c);
    }

    @Override // Hd.G
    public final String getName() {
        return "wechat_file_upload";
    }

    public final int hashCode() {
        return this.c.hashCode() + Ie.K0.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbL = A8.b.l("GetFilesFromWechatMiniPro(uid=", this.a, ", chatId=", this.b, ", callback=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
