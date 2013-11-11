/*
 * Copyright 2013 Christian Autermann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.autermann.yaml.nodes;

import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;

import org.joda.time.DateTime;
import org.yaml.snakeyaml.DumperOptions;

import com.github.autermann.yaml.Yaml;
import com.github.autermann.yaml.YamlNode;
import com.google.common.collect.Iterators;

/**
 * A abstract {@link YamlNode} offering default implementations for most
 * methods.
 *
 * @author Christian Autermann
 */
public abstract class YamlBaseNode implements YamlNode {

    @Override
    public YamlMapNode asMap() {
        return null;
    }

    @Override
    public YamlOrderedMapNode asOrderedMap() {
        return null;
    }

    @Override
    public YamlPairsNode asPairs() {
        return null;
    }

    @Override
    public YamlSeqNode asSequence() {
        return null;
    }

    @Override
    public YamlSetNode asSet() {
        return null;
    }

    @Override
    public boolean exists() {
        return true;
    }

    @Override
    public boolean isContainer() {
        return false;
    }

    @Override
    public boolean isMap() {
        return false;
    }

    @Override
    public boolean isOrderedMap() {
        return false;
    }

    @Override
    public boolean isPairs() {
        return false;
    }

    @Override
    public boolean isSequence() {
        return false;
    }

    @Override
    public boolean isSet() {
        return false;
    }

    @Override
    public boolean isScalar() {
        return false;
    }

    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public boolean isBoolean() {
        return false;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public boolean isNumber() {
        return false;
    }

    @Override
    public boolean isDecimal() {
        return false;
    }

    @Override
    public boolean isFloat() {
        return false;
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public boolean isBigDecimal() {
        return false;
    }

    @Override
    public boolean isIntegral() {
        return false;
    }

    @Override
    public boolean isBigInteger() {
        return false;
    }

    @Override
    public boolean isLong() {
        return false;
    }

    @Override
    public boolean isInt() {
        return false;
    }

    @Override
    public boolean isShort() {
        return false;
    }

    @Override
    public boolean isByte() {
        return false;
    }

    @Override
    public boolean isText() {
        return false;
    }

    @Override
    public boolean isTime() {
        return false;
    }

    @Override
    public BigDecimal asBigDecimalValue() {
        return asBigDecimalValue(DEFAULT_BIG_DECIMAL_VALUE);
    }

    @Override
    public BigDecimal asBigDecimalValue(BigDecimal defaultValue) {
        return defaultValue;
    }

    @Override
    public BigDecimal bigDecimalValue() {
        return null;
    }

    @Override
    public BigInteger asBigIntegerValue() {
        return asBigIntegerValue(DEFAULT_BIG_INTEGER_VALUE);
    }

    @Override
    public BigInteger asBigIntegerValue(BigInteger defaultValue) {
        return defaultValue;
    }

    @Override
    public BigInteger bigIntegerValue() {
        return DEFAULT_BIG_INTEGER_VALUE;
    }

    @Override
    public boolean asBooleanValue() {
        return asBooleanValue(DEFAULT_BOOLEAN_VALUE);
    }

    @Override
    public boolean asBooleanValue(boolean defaultValue) {
        return defaultValue;
    }

    @Override
    public boolean booleanValue() {
        return DEFAULT_BOOLEAN_VALUE;
    }

    @Override
    public byte asByteValue() {
        return asByteValue(DEFAULT_BYTE_VALUE);
    }

    @Override
    public byte asByteValue(byte defaultValue) {
        return defaultValue;
    }

    @Override
    public byte byteValue() {
        return DEFAULT_BYTE_VALUE;
    }

    @Override
    public byte[] asBinaryValue() {
        return asBinaryValue(null);
    }

    @Override
    public byte[] asBinaryValue(byte[] defaultValue) {
        return defaultValue;
    }

    @Override
    public byte[] binaryValue() {
        return null;
    }

    @Override
    public double asDoubleValue() {
        return asDoubleValue(DEFAULT_DOUBLE_VALUE);
    }

    @Override
    public double asDoubleValue(double defaultValue) {
        return defaultValue;
    }

    @Override
    public double doubleValue() {
        return DEFAULT_DOUBLE_VALUE;
    }

    @Override
    public float asFloatValue() {
        return asFloatValue(DEFAULT_FLOAT_VALUE);
    }

    @Override
    public float asFloatValue(float defaultValue) {
        return defaultValue;
    }

    @Override
    public float floatValue() {
        return DEFAULT_FLOAT_VALUE;
    }

    @Override
    public int asIntValue() {
        return asIntValue(DEFAULT_INTEGER_VALUE);
    }

    @Override
    public int asIntValue(int defaultValue) {
        return defaultValue;
    }

    @Override
    public int intValue() {
        return DEFAULT_INTEGER_VALUE;
    }

    @Override
    public long asLongValue() {
        return asLongValue(DEFAULT_LONG_VALUE);
    }

    @Override
    public long asLongValue(long defaultValue) {
        return defaultValue;
    }

    @Override
    public long longValue() {
        return DEFAULT_LONG_VALUE;
    }

    @Override
    public Number asNumberValue() {
        return asNumberValue(null);
    }

    @Override
    public Number asNumberValue(Number defaultValue) {
        return defaultValue;
    }

    @Override
    public Number numberValue() {
        return null;
    }

    @Override
    public short asShortValue() {
        return asShortValue(DEFAULT_SHORT_VALUE);
    }

    @Override
    public short asShortValue(short defaultValue) {
        return defaultValue;
    }

    @Override
    public short shortValue() {
        return DEFAULT_SHORT_VALUE;
    }

    @Override
    public String asTextValue() {
        return asTextValue(null);
    }

    @Override
    public String asTextValue(String defaultValue) {
        return defaultValue;
    }

    @Override
    public String textValue() {
        return null;
    }

    @Override
    public DateTime asDateTimeValue() {
        return asDateTimeValue(null);
    }

    @Override
    public DateTime asDateTimeValue(DateTime defaultValue) {
        return defaultValue;
    }

    @Override
    public DateTime dateTimeValue() {
        return null;
    }

    @Override
    public Date asDateValue() {
        return asDateValue(null);
    }

    @Override
    public Date asDateValue(Date defaultValue) {
        return defaultValue;
    }

    @Override
    public Date dateValue() {
        return null;
    }

    @Override
    public String dump() {
        return new Yaml().dump(this);
    }

    @Override
    public void dump(Writer output) {
        new Yaml().dump(this, output);
    }

    @Override
    public void dump(OutputStream output) {
        new Yaml().dump(this, output);
    }

    @Override
    public String dump(DumperOptions options) {
        return new Yaml(options).dump(this);
    }

    @Override
    public void dump(Writer output, DumperOptions options) {
        new Yaml(options).dump(this, output);
    }

    @Override
    public void dump(OutputStream output, DumperOptions options) {
        new Yaml(options).dump(this, output);
    }

    @Override
    public String dump(Yaml yaml) {
        return yaml.dump(this);
    }

    @Override
    public void dump(Writer output, Yaml yaml) {
        yaml.dump(this, output);
    }

    @Override
    public void dump(OutputStream output, Yaml yaml) {
        yaml.dump(this, output);
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public YamlNode path(int key) {
        return YamlMissingNode.instance();
    }

    @Override
    public YamlNode get(int key) {
        return null;
    }

    @Override
    public YamlNode get(String key) {
        return null;
    }

    @Override
    public YamlNode get(YamlNode key) {
        return null;
    }

    @Override
    public YamlNode path(String key) {
        return YamlMissingNode.instance();
    }

    @Override
    public YamlNode path(YamlNode key) {
        return YamlMissingNode.instance();
    }

    @Override
    public boolean has(int key) {
        return false;
    }

    @Override
    public boolean has(String key) {
        return false;
    }

    @Override
    public boolean has(YamlNode key) {
        return false;
    }

    @Override
    public boolean hasNotNull(int key) {
        return false;
    }

    @Override
    public boolean hasNotNull(String key) {
        return false;
    }

    @Override
    public boolean hasNotNull(YamlNode key) {
        return false;
    }

    @Override
    public Iterator<YamlNode> iterator() {
        return Iterators.<YamlNode>singletonIterator(this);
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();
}