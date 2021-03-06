/*
 * Copyright 2013-2015 Christian Autermann
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

import java.math.BigDecimal;

import org.yaml.snakeyaml.nodes.Tag;

import com.github.autermann.yaml.ReturningYamlNodeVisitor;
import com.github.autermann.yaml.YamlNodeVisitor;

/**
 * A abstract {@link com.github.autermann.yaml.YamlNode} for decimal values.
 *
 * @see com.github.autermann.yaml.nodes.YamlBigDecimalNode
 * @see com.github.autermann.yaml.nodes.YamlDoubleNode
 * @see com.github.autermann.yaml.nodes.YamlFloatNode
 *
 * @author Christian Autermann
 */
public abstract class YamlDecimalNode extends YamlNumberNode {

    @Override
    public Tag tag() {
        return Tag.FLOAT;
    }

    @Override
    public boolean isDecimal() {
        return true;
    }

    @Override
    public boolean isBigDecimal() {
        return true;
    }

    @Override
    public void accept(YamlNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(ReturningYamlNodeVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public abstract Number value();

    @Override
    public abstract BigDecimal bigDecimalValue();

    @Override
    public BigDecimal asBigDecimalValue(BigDecimal defaultValue) {
        return bigDecimalValue();
    }
}
