package vb;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y implements ObjectEncoder {
    public static final Y a = new Y();

    static {
        s3.e.B(3, s3.e.z(2, s3.e.z(1, FieldDescriptor.builder("logEventKey"), "eventCount"), "inferenceDurationStats"));
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw null;
    }
}
