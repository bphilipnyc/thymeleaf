/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.processor.cdatasection;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.ICDATASection;
import org.thymeleaf.processor.IProcessor;

/**
 * <p>
 *   Base interface for all processors that execute on CDATA Section events ({@link ICDATASection}).
 * </p>
 *
 * @author Daniel Fern&aacute;ndez
 * @see AbstractCDATASectionProcessor
 * @see ICDATASectionStructureHandler
 * @since 3.0.0
 * 
 */
public interface ICDATASectionProcessor extends IProcessor {

    public void process(
            final ITemplateContext context,
            final ICDATASection cdataSection, final ICDATASectionStructureHandler structureHandler);

}
