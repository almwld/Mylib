package Vc;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class Y {

    @NotNull
    public static final X Companion = new X();
    public final String a;

    static {
        new Y(BuildConfig.FLAVOR);
    }

    public /* synthetic */ Y(int i, String str) {
        if ((i & 1) == 0) {
            this.a = BuildConfig.FLAVOR;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y) && Intrinsics.b(this.a, ((Y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return S0.b.l("GetOutputFileTreeByShareRequest(chatShareId=", this.a, ")");
    }

    public Y(String str) {
        Intrinsics.checkNotNullParameter(str, "chatShareId");
        this.a = str;
    }
}
